package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "pay")

public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idpay;

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_payment_package")
    private Payment_package payment_package;

    private Integer number_posted;

    private Date pay_date;

    private Boolean status;


    public Pay() {

    }

    public Pay(Integer idpay, Account account, Payment_package payment_package, Integer number_posted, Date pay_date, Boolean status) {
        this.idpay = idpay;
        this.account = account;
        this.payment_package = payment_package;
        this.number_posted = number_posted;
        this.pay_date = pay_date;
        this.status = status;
    }

    public Integer getIdpay() {
        return idpay;
    }

    public void setIdpay(Integer idpay) {
        this.idpay = idpay;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Payment_package getPay() {
        return payment_package;
    }

    public void setPay(Payment_package payment_package) {
        this.payment_package = payment_package;
    }

    public Integer getNumber_posted() {
        return number_posted;
    }

    public void setNumber_posted(Integer number_posted) {
        this.number_posted = number_posted;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
