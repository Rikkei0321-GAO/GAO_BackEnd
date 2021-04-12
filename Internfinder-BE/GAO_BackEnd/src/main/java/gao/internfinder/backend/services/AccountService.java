package gao.internfinder.backend.services;

import gao.internfinder.backend.Entity.Account;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

public interface AccountService {
    /**
     *Kieu Trang
     */
    Account findAccountByUserName(String username);
    /**
     *Kieu Trang
     */
    Integer findIdUserByUserName(String username);
    /**
     *Kieu Trang
     */
    String existsByUserName(String username);
    /**
     *Kieu Trang
     */
    Boolean existsById(Integer bookId);
    /**
     *Kieu Trang
     */
    void addNew(String username, String password, String company_name,
                String address, String phone, String tax,
                String contact, String email) throws MessagingException, UnsupportedEncodingException;
    /**
     *Kieu Trang
     */
    Boolean findAccountByVerificationCode(String code);

    /**
     *Kieu Trang
     */
    Boolean findAccountByVerificationCodeToResetPassword(String code);
    /**
     *Kieu Trang
     */
    void addVerificationCode(String username) throws MessagingException, UnsupportedEncodingException;

    
}
