package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Repository.AccountRepository;
import gao.internfinder.backend.services.AccountService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    JavaMailSender javaMailSender;

    @Override
    public Account findAccountByUserName(String username) {
       return null;
    }

    @Override
    public Integer findIdUserByUserName(String username) {
        return null;
    }

    @Override
    public String existsByUserName(String username) {
        return accountRepository.existsByUserName(username);
    }

    @Override
    public String existsByEmail(String email) {
        return accountRepository.existsByEmail(email);
    }

    @Override
    public Boolean existsById(Integer bookId) {
        return null;
    }

    @Override
    public void addNew(String username, String password, String company_name, String address, String phone, String tax, String contact, String email) throws MessagingException, UnsupportedEncodingException {
        accountRepository.addNew(username,password,company_name,address,phone,tax,contact,email);
    }


    @Override
    public Boolean findAccountByVerificationCode(String code) {
        Account account = accountRepository.findAccountByVerificationCode(code);
        if(account == null) {
            return false;
        }else {
            account.setVerificationCode(null);
            accountRepository.save(account);
            return true;
        }
    }

    @Override
    public Boolean findAccountByVerificationCodeToResetPassword(String code) {
        Account account = accountRepository.findAccountByVerificationCode(code);
        return account !=null;
    }

    @Override
    public void addVerificationCode(String email) throws MessagingException, UnsupportedEncodingException {
        String code = RandomString.make(64);
        accountRepository.addVerificationCode(code, email);
        Account account = accountRepository.findAccountByVerificationCode(code);
        this.sendVerificationEmailForResetPassWord(account.getUsername(), code, account.getEmail());

    }

    @Override
    public void saveNewPassword(String password, String code) {
        accountRepository.saveNewPassword(password,code);

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
