package gao.internfinder.backend.Service.Imp;


import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Service.ResetPassService;
import gao.internfinder.backend.repository.ResetRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
public class ResetPassImpService implements ResetPassService {
    @Autowired
    ResetRepository resetRepository;

    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public String existsByEmails(String email) {
        return resetRepository.existsByEmails(email);
    }

    @Override
    public Boolean findAccountByVerificationCode(String code) {
        Account account = resetRepository.findAccountByVerificationCode(code);
        if(account == null) {
            return false;
        }else {
            account.setVerificationCode(null);
            resetRepository.save(account);
            return true;
        }
    }

    @Override
    public Boolean findAccountByVerificationCodeToResetPassword(String code) {
        Account account = resetRepository.findAccountByVerificationCode(code);
        return account !=null;
    }

    @Override
    public void addVerificationCode(String email) throws MessagingException, UnsupportedEncodingException {
        String code = RandomString.make(64);
        resetRepository.addVerificationCode(code, email);
        Account account = resetRepository.findAccountByVerificationCode(code);
        this.sendVerificationEmailForResetPassWord(account.getUsername(), code, account.getEmail());


    }

    @Override
    public void saveNewPassword(String password, String code) {
        resetRepository.saveNewPassword(password,code);

    }
    public void sendVerificationEmailForResetPassWord(String userName, String randomCode, String email) throws MessagingException, UnsupportedEncodingException {
        String subject = "H??y x??c th???c email c???a b???n";
        String mailContent = "Thanh H???i";
        String confirmUrl = "http://localhost:4200/login/verify-reset-password?code=" + randomCode;


        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
        helper.setFrom("thanhhai23399@gmail.com");
        helper.setTo(email);
        helper.setSubject(subject);
        mailContent = "<p sytle='color:red;'>Xin ch??o " + userName + " ,<p>" + "<p> Nh???n v??o link sau ????? x??c th???c email c???a b???n:</p>" +
                "<h3><a href='" + confirmUrl + "'>Link X??c th???c( nh???n v??o ????y)!</a></h3>";
        helper.setText(mailContent, true);
        javaMailSender.send(message);
    }

}
