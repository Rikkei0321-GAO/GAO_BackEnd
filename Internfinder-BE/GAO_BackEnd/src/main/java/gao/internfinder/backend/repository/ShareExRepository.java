package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Share_experience;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface ShareExRepository extends JpaRepository<Share_experience, Integer> {
    @Modifying
    @Query(value = "INSERT INTO `share_experience`(`content`, `title`,`modife_date`,`create_date`,`id_account`, `idshare` ,`image_path`) " +
            "value (?1, ?2, ?3, ?4, ?5,?6,?7) ", nativeQuery = true)
    void createSharePost(String content, String title, Date modife_date, Date create_date, Integer id_account, Integer idshare, String image_path);

    @Query(value = "select * from share_experience cm order by cm.modife_date desc ", nativeQuery = true)
    List<Share_experience> findAll();

}
