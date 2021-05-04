package gao.internfinder.backend.repository;


import gao.internfinder.backend.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ResetRepository extends JpaRepository<Account,Integer> {

    Boolean existsByEmail(String email);
    @Query(value = "SELECT email FROM account where email= ?1", nativeQuery = true)
    String existsByEmails(String email);

    @Query(value = "select * from account where verification_code =?1",nativeQuery = true)
    Account findAccountByVerificationCode(String verifyCode);

    @Modifying
    @Query(value ="update account set verification_code=?1 where email =?2",nativeQuery = true)
    void addVerificationCode(String code,String email);

    @Modifying
    @Query(value = "update account set password =?1,verification_code=null where verification_code=?2 ",nativeQuery = true)
    void saveNewPassword(String password, String code);

}
