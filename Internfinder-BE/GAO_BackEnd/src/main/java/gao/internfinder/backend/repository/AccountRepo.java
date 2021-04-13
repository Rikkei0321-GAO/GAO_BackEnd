package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface AccountRepo extends JpaRepository<Account, Integer> {


    @Modifying
    @Query(value = "update account set pass_word =?1,verification_code=null where verification_code=?2 ",nativeQuery = true)
    void saveNewPassword(String password, String code);

    @Query(value = "SELECT email from  account where email = ?1", nativeQuery = true)
    String existsByUserName(String username);

    @Query(value = "select * from account where verification_code =?1",nativeQuery = true)
    Account findAccountByVerificationCode(String verifyCode);


    @Modifying
    @Query(value ="update account set verification_code=?1 where email =?2",nativeQuery = true)
    void addVerificationCode(String code, String username);



}
