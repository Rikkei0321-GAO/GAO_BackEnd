package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Repository.AccountRepository;
import gao.internfinder.backend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;
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
    public Boolean existsById(Integer bookId) {
        return null;
    }

    @Override
    public void addNew(String username, String password, String company_name, String address, String phone, String tax, String contact, String email) throws MessagingException, UnsupportedEncodingException {
        accountRepository.addNew(username,password,company_name,address,phone,tax,contact,email);
    }


    @Override
    public Boolean findAccountByVerificationCode(String code) {
        return null;
    }

    @Override
    public Boolean findAccountByVerificationCodeToResetPassword(String code) {
        return null;
    }

    @Override
    public void addVerificationCode(String username) throws MessagingException, UnsupportedEncodingException {

    }
}
