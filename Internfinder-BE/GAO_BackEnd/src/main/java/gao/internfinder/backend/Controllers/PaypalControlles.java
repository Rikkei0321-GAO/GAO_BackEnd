package gao.internfinder.backend.Controllers;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import gao.internfinder.backend.Utils.Utils;
import gao.internfinder.backend.config.PaypalPaymentIntent;
import gao.internfinder.backend.config.PaypalPaymentMethod;
import gao.internfinder.backend.services.PaypalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PaypalControlles {
    @Autowired
    PaypalService paypalService;


    public static final String SUCCESS_URL = "pay/success";
    public static final String CANCEL_URL = "pay/cancel";

    private Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/pay")
    public String pay(HttpServletRequest request, @RequestParam("price") double price ){
        String cancelUrl = Utils.getBaseURL(request) + "/" + CANCEL_URL;
        String successUrl = Utils.getBaseURL(request) + "/" + SUCCESS_URL;
        try {
            Payment payment = paypalService.createPayment(
                    price,
                    "USD",
                    PaypalPaymentMethod.paypal,
                    PaypalPaymentIntent.sale,
                    "payment description",
                    cancelUrl,
                    successUrl);
            for(Links links : payment.getLinks()){
                if(links.getRel().equals("approval_url")){
                    return "redirect:" + links.getHref();
                }
            }
        } catch (PayPalRESTException e) {
            log.error(e.getMessage());
        }
        return "redirect:/";
    }

    @GetMapping(value = CANCEL_URL)
    public String cancelPay() {
        return "cancel";
    }

    @GetMapping(value = SUCCESS_URL)
    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId) {
        try {
            Payment payment = paypalService.executePayment(paymentId, payerId);
            System.out.println(payment.toJSON());
            if (payment.getState().equals("approved")) {
                return "success";
            }
        } catch (PayPalRESTException e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/";
    }


}
