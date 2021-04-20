package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Repository.CreateNewsRepository;
import gao.internfinder.backend.services.ICreateNewsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateNews implements ICreateNewsSer {
    @Autowired
    CreateNewsRepository createNewsRepository;
    @Override
    public Boolean createNews(int id_account, int id_category, String decriptions, String title,
                              String image, String position, String salary, String work_loaction, String degree,
                              String major, String working_time, String benefit, String sex, String name_nd,
                              String address_nd, String email_nd, String profile_language, String profile_requirement,
                              String phone, String job_requirements, int quanlity, String type_of_work) {
        try {
            createNewsRepository.createNews(id_account,id_category, decriptions, title, image, position, salary,
                    work_loaction, degree, major, working_time, benefit, sex, name_nd, address_nd, email_nd,
                    profile_language, profile_requirement, phone, job_requirements,  quanlity, type_of_work);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
