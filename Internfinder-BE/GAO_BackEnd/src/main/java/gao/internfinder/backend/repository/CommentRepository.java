package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Comment;
import gao.internfinder.backend.dto.CommentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;
@Repository
@Transactional
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query(value = "SELECT  * from  `comment`  where `comment`.`id_share`= ?1 order by `comment`.`create_date` desc ", nativeQuery = true)
    public List<Comment> findAllByShare_experience(Integer id_share);

    @Modifying
    @Query(value = "INSERT INTO `comment`(`content`,`create_date` ,`id_account`, `id_share` ,`idcoment`) " +
            "value (?1, ?2, ?3, ?4, ?5) ", nativeQuery = true)
    void createCommentPost(String content, Date create_date, Integer id_account, Integer id_share, Integer idcoment);

    @Query(value = "SELECT  * from  `comment`  where `comment`.`id_share`= ?1 order by `comment`.`create_date` desc ", nativeQuery = true)
    Page<Comment> findAllByShare_experience(Integer id_share, Pageable pageable);

    @Modifying
    @Query(value = "UPDATE `comment` SET `content` = ?1 WHERE (`idcoment` = ?2)", nativeQuery = true)
    void updateComment(String content, Integer id);

    @Query(value = "SELECT * FROM `comment` where `comment`.`idcoment` = ?1", nativeQuery = true)
    Comment findByIdcoment(Integer id);
    @Query(value = "select * from  comment  cm where  cm.content like ?1", nativeQuery = true)
    List<Comment> findByContent(String fullname);

}
