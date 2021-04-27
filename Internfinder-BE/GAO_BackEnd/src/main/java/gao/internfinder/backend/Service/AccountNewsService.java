package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.Account;

import java.util.List;

public interface AccountNewsService {
    List<Account> finAll();
    void addAccount(Account account);
}
