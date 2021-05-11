package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface CreateNewsRepository extends JpaRepository<News,Integer> {
    @Modifying(clearAutomatically = true)
    @Query(value = "insert into news (news.id_account,news.id_category,news.decriptions,news.title,news.image,news.position, " +
            "news.salary,news.work_loaction,news.degree,news.major,news.working_time,news.benefit,news.sex,news.name_nd,news.address_nd, " +
            "news.email_nd,news.profile_language,news.profile_requirement,news.phone,news.job_requirements,news.quanlity,news.type_of_work,news.create_date,news.status) " +
            "values (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24)",nativeQuery = true)
    void createNews(int id_account, int id_category, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree,
                    String major, String working_time, String benefit, String sex, String name_nd, String address_nd, String email_nd, String profile_language,
                    String profile_requirement, String phone, String job_requirements, int quanlity, String type_of_work, Date create_date , Boolean status);

    @Query(value = "SELECT  * from  `news`  where `news`.`id_news`= ?1 order by `news`.`create_date` desc ", nativeQuery = true)
    List<News> findAllByNews(Integer id_news);

    @Modifying(clearAutomatically = true)
    @Query(value = "Update news set (`id_account` = ?1,`id_category` = ?2,`decriptions` = ?3,`title`= ?4,`image`= ?5,`position`= ?6, " +
            "`salary` = ?7,`work_loaction`= ?8,`degree`= ?9,`major``= ?10,`working_time`= ?11,`benefit`= ?12,`sex`= ?12,`name_nd`= ?14,`address_nd`= ?15, " +
            "`email_nd``= ?16,`profile_language`= ?17,`profile_requirement` = ?18,`phone`= ?18,`job_requirements`= ?19,`quanlity`= ?20,`type_of_work` = ?21,`create_date`= ?22,`status`= ?23) where (`id_news` =?24)",nativeQuery = true)
    void Update(int id_account, int id_category, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree,
                String major, String working_time, String benefit, String sex, String name_nd, String address_nd, String email_nd, String profile_language,
                String profile_requirement, String phone, String job_requirements, int quanlity, String type_of_work, Date create_date , Boolean status,Integer idNews);



}
