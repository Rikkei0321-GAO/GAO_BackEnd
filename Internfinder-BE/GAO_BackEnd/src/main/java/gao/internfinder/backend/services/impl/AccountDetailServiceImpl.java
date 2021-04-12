package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountDetailServiceImpl implements UserDetailsService {

    @Autowired
    AccountRepository accountRepository;
    /**
     * Kieu trang made it
     */
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username)  {
        Account account = accountRepository.findAccountByUsername(username);
        if(account==null){
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        return AccountDetailsImpl.build(account);
    }
}
