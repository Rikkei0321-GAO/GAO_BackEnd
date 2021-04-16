package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
@Repository
@Transactional
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query(value = "SELECT  * from  `comment`  where `comment`.`id_share`= ?1", nativeQuery = true)
    public List<Comment> findAllByShare_experience(Integer id_share);


    @Modifying
    @Query(value = "INSERT INTO `comment`(`content`,`create_date` ,`id_account`, `id_share` ,`idcoment`) " +
            "value (?1, ?2, ?3, ?4, ?5) ", nativeQuery = true)
    void createCommentPost(String content, Date create_date, Integer id_account, Integer id_share, Integer idcoment);
}
