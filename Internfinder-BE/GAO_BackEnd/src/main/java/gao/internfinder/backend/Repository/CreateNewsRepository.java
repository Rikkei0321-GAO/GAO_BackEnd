package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CreateNewsRepository extends JpaRepository<News, Integer> {
    @Modifying(clearAutomatically = true)
    @Query(value = "insert into news (news.id_account,news.id_category,news.decriptions,news.title,news.image,news.position, " +
            "news.salary,news.work_loaction,news.degree,news.major,news.working_time,news.benefit,news.sex,news.name_nd,news.address_nd, " +
            "news.email_nd,news.profile_language,news.profile_requirement,news.phone,news.job_requirements,news.quanlity,news.type_of_work) " +
            "values (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22)",nativeQuery = true)
    void createNews(int id_account,int id_category, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree, String major, String working_time, String benefit, String sex, String name_nd, String address_nd, String email_nd, String profile_language, String profile_requirement, String phone, String job_requirements, int quanlity, String type_of_work);

}
