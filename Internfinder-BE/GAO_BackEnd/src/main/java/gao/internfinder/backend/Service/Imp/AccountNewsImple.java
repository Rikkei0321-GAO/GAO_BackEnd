package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Service.AccountNewsService;
import gao.internfinder.backend.repository.AccountRepository;
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
