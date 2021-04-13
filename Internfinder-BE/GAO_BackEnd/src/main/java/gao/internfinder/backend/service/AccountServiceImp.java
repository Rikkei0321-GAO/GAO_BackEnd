package gao.internfinder.backend.service;


import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.repository.AccountRepo;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    JavaMailSender javaMailSender;


    @Override
    public Boolean findAccountByVerificationCode(String code) {
        Account account = accountRepo.findAccountByVerificationCode(code);
        if(account == null) {
            return false;
        }else {
            account.setVerificationCode(null);
            accountRepo.save(account);
            return true;
        }
    }

    @Override
    public Boolean findAccountByVerificationCodeToResetPassword(String code) {
        Account account = accountRepo.findAccountByVerificationCode(code);
        return account !=null;
    }

    @Override
    public String existsByUserName(String username) {
        return accountRepo.existsByUserName(username);
    }

    @Override
    public void addVerificationCode(String username) throws MessagingException, UnsupportedEncodingException, UnsupportedEncodingException, MessagingException {
        String code = RandomString.make(64);
        accountRepo.addVerificationCode(code, username);
        Account account = accountRepo.findAccountByVerificationCode(code);
        this.sendVerificationEmailForResetPassWord(account.getUserName(), code, account.getEmail());

    }

    @Override
    public void saveNewPassword(String password, String code) {
        accountRepo.saveNewPassword(password,code);

    }
    public void sendVerificationEmailForResetPassWord(String userName, String randomCode, String email) throws MessagingException, UnsupportedEncodingException {
        String subject = "Hãy xác thực email của bạn";
        String mailContent = "";
        String confirmUrl = "http://localhost:4200/login/verify-reset-password?code=" + randomCode;


        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
        helper.setFrom("thanhhai23399@gmail.com");
        helper.setTo(email);
        helper.setSubject(subject);
        mailContent = "<p sytle='color:red;'>Xin chào " + userName + " ,<p>" + "<p> Nhấn vào link sau để xác thực email của bạn:</p>" +
                "<h3><a href='" + confirmUrl + "'>Link Xác thực( nhấn vào đây)!</a></h3>";
        helper.setText(mailContent, true);
        javaMailSender.send(message);
    }
}
