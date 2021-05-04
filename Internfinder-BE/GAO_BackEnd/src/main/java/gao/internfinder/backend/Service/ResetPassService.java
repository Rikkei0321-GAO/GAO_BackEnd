package gao.internfinder.backend.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

public interface ResetPassService {

    String existsByEmails(String email);

    Boolean findAccountByVerificationCode(String code);


    Boolean findAccountByVerificationCodeToResetPassword(String code);

    void addVerificationCode(String email) throws MessagingException, UnsupportedEncodingException;

    void saveNewPassword(String password, String code);
}
