package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Service.ICreateNewsSer;
import gao.internfinder.backend.dto.NewsDto;
import gao.internfinder.backend.repository.CreateNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
@Service
public class CreateNews implements ICreateNewsSer {
    @Autowired
    CreateNewsRepository createNewsRepository;

    @Override
    public Boolean createNews(int id_account, int id_category, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree, String major, String working_time, String benefit, String sex, String name_nd, String address_nd, String email_nd, String profile_language, String profile_requirement, String phone, String job_requirements, int quanlity, String type_of_work, Date create_date, Boolean status) {
        try {
            createNewsRepository.createNews(id_account, id_category, decriptions, title, image, position, salary,
                    work_loaction, degree, major, working_time, benefit, sex, name_nd, address_nd, email_nd,
                    profile_language, profile_requirement, phone, job_requirements, quanlity, type_of_work, create_date, status);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void update(NewsDto newsDto) {
        createNewsRepository.Update(newsDto.getId_account(), newsDto.getId_category(), newsDto.getDecriptions(),
                newsDto.getTitle(), newsDto.getImage(), newsDto.getPosition(), newsDto.getSalary(),
                newsDto.getWork_loaction(), newsDto.getDegree(), newsDto.getMajor(), newsDto.getWorking_time(),
                newsDto.getBenefit(), newsDto.getSex(), newsDto.getName_nd(), newsDto.getAddress_nd(), newsDto.getEmail_nd(), newsDto.getProfile_language(), newsDto.getProfile_requirement(), newsDto.getPhone(), newsDto.getJob_requirements(), newsDto.getQuanlity(),
                newsDto.getType_of_work(), newsDto.getCreate_date(), newsDto.getStatus(), newsDto.getId_news());
    }
}

    //    @Override
//    public Boolean Update(int id_account, int id_category, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree, String major, String working_time, String benefit, String sex, String name_nd, String address_nd, String email_nd, String profile_language, String profile_requirement, String phone, String job_requirements, int quanlity, String type_of_work, Date create_date, Boolean status, Integer idNews) {
//        try {
//            createNewsRepository.Update(id_account, id_category, decriptions, title, image, position, salary,
//                    work_loaction, degree, major, working_time, benefit, sex, name_nd, address_nd, email_nd,
//                    profile_language, profile_requirement, phone, job_requirements, quanlity, type_of_work, create_date,status,idNews);
//        } catch (Exception e) {
//            return false;
//        }
//        return true;    }
//        @Override
//        public void Update(NewsDto newsDto) {
//            createNewsRepository.Update(newsDto.getId_account(), newsDto.getId_category(), newsDto.getDecriptions(),
//                    newsDto.getTitle(), newsDto.getImage(), newsDto.getPosition(), newsDto.getSalary(),
//                    newsDto.getWork_loaction(), newsDto.getDegree(), newsDto.getMajor(), newsDto.getWorking_time(),
//                    newsDto.getBenefit(), newsDto.getSex(), newsDto.getName_nd(), newsDto.getAddress_nd(), newsDto.getEmail_nd(), newsDto.getProfile_language(), newsDto.getProfile_requirement(), newsDto.getPhone(), newsDto.getJob_requirements(), newsDto.getQuanlity(), newsDto.getType_of_work(), newsDto.getCreate_date(), newsDto.getStatus(), newsDto.getIdNews());
//            }
//
//        }

