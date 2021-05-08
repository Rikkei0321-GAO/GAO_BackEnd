package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Created_cv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
@Transactional
public interface CreateCVRepository extends JpaRepository<Created_cv,Integer>{
    @Modifying
    @Query(value = "INSERT INTO `cv`(`file_name`,`create_date` ,`id_account`, `idtemplate_cv` ,`path`) " +
            "value (?1, ?2, ?3, ?4, ?5) ", nativeQuery = true)
    void createCV(String file_name, Date create_date, Integer id_account, Integer idtemplate_cv, String path);
}
