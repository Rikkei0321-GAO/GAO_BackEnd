package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Repository.AccountRepository;
import gao.internfinder.backend.services.AccountNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountNewsImple implements AccountNewsService {
    @Autowired
    private AccountRepository accountNewsService;

    @Override
    public List<Account> finAll() {
        return accountNewsService.findAll();
    }

    @Override
    public void addAccount(Account account) {
        accountNewsService.save(account);
    }

}
