package gao.internfinder.backend.service;


import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

public interface AccountService {

    Boolean findAccountByVerificationCode(String code);


    Boolean findAccountByVerificationCodeToResetPassword(String code);


    String existsByUserName(String email);

    void addVerificationCode(String email) throws MessagingException, UnsupportedEncodingException, MessagingException;


    void saveNewPassword(String password, String code);


}
