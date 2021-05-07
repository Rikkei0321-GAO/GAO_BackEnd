package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Cv_apply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
@Transactional
public interface ApplyRepository extends JpaRepository<Cv_apply,Integer> {
    @Modifying(clearAutomatically = true)
    @Query(value = "insert into cv_apply (cv_apply.id_news,cv_apply.id_account,cv_apply.url, cv_apply.create_date) " +
            "values (?1, ?2, ?3, ?4)",nativeQuery = true)
    void createApply(int id_news, int id_account,String url, Date create_date);
}
