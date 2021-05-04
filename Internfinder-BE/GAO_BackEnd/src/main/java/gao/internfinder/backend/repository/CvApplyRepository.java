package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Comment;
import gao.internfinder.backend.Entity.Cv_apply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CvApplyRepository extends JpaRepository<Cv_apply, Integer> {

    @Query(value = "SELECT  * from  `Cv_apply`  where `Cv_apply`.`id_news`= ?1 order by `Cv_apply`.`create_date` desc ", nativeQuery = true)
     List<Cv_apply> findAllByNews(Integer id_news);
}
