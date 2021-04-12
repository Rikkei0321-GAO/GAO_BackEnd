package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findAccountByUsername(String username);

    /**
    *Kieu Trang
     */
    @Query(value = "select account_id from  account where user_name = ?1", nativeQuery = true)
    Integer findIdUserByUserName(String username);

    /**
    *Kieu Trang
     */
    @Query(value = "SELECT username from  internfinder_offical.account where username = ?1", nativeQuery = true)
    String existsByUserName(String username);

    /**
    *Kieu Trang
     */
    @Query(value = "SELECT email FROM account where email= ?1", nativeQuery = true)
    String existsByEmail(String email);

    /**
    *Kieu Trang
     */
    @Modifying
    @Query(value = "insert into account(username,password,company_name,address,phone,tax_code,name_contact,email) values (?1,?2,?3,?4,?5,?6,?7,?8)", nativeQuery = true)
    void addNew(String username, String password, String company_name,
                String address, String phone, String tax,
                String contact, String email);

    /**
    *Kieu Trang
     */
    @Query(value = "select * from account where verification_code =?1",nativeQuery = true)
    Account findAccountByVerificationCode(String verifyCode);

    /**
    *Kieu Trang
     */
    @Modifying
    @Query(value ="update account set verification_code=?1 where user_name =?2",nativeQuery = true)
    void addVerificationCode(String code,String username);

    /**
    *Kieu Trang
     */
    @Modifying
    @Query(value = "update account set encrypt_pw =?1,verification_code=null where verification_code=?2 ",nativeQuery = true)
    void saveNewPassword(String password, String code);
}
