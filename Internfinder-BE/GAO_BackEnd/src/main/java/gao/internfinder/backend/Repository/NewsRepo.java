package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepo extends JpaRepository<News, Integer> {
//    @Query(value = "select account.id_account as id_account, this.category.birthday as birthday, news.company_name as company_name, \n" +
//            " news.create_date as create_date, news.email as email, news.full_name as birthday, ,account.id as accountID, friend.friend_id as friendID, \n" +
//            " (select count(account.id) \n" +
//            " from account \n" +
//            " where account.id in ( select friend.friend_id from friend where friend.account_id = accountID) \n" +
//            " and account.id in ( select friend.friend_id from friend where friend.account_id = ?1) ) as mutualFriends \n" +
//            " from account \n" +
//            " join friend on account.id = friend.account_id \n" +
//            " where account.id != ?1 and friend.friend_id = ?1 and friend.state_id =1;", nativeQuery = true)
//    List<> getAllMadeFriends(Integer id);
}
