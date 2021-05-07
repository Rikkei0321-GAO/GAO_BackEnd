package gao.internfinder.backend.Service;

import gao.internfinder.backend.dto.CommentDTO;
import gao.internfinder.backend.dto.NewsDto;

import java.util.Date;

public interface ICreateNewsSer {
    Boolean createNews(int id_account, int id_category, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree, String major, String working_time, String benefit, String sex, String name_nd, String address_nd, String email_nd, String profile_language, String profile_requirement, String phone, String job_requirements, int quanlity, String type_of_work, Date create_date, Boolean status);
    void update(NewsDto newsDto);


}
