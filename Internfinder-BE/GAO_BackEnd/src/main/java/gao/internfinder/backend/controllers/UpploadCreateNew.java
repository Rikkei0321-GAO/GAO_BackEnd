package gao.internfinder.backend.controllers;

import gao.internfinder.backend.Service.ICategorySer;
import gao.internfinder.backend.Service.ICreateNewsSer;
import gao.internfinder.backend.dto.ICategory;
import gao.internfinder.backend.dto.NewsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/news")
public class UpploadCreateNew {

    @Autowired
    ICreateNewsSer iCreateNewsSer;

    @Autowired
    ICategorySer iCategorySer;

    @RequestMapping(value = "/create-news", method = RequestMethod.POST)
    @ResponseBody
    public boolean createPost(@RequestBody NewsDto newsDto) {
        if (newsDto != null) {
            if (iCreateNewsSer.createNews(newsDto.getId_account(), newsDto.getId_category(), newsDto.getDecriptions(), newsDto.getTitle(), newsDto.getImage(), newsDto.getPosition(), newsDto.getSalary(), newsDto.getWork_loaction(), newsDto.getDegree(), newsDto.getMajor(), newsDto.getWorking_time(), newsDto.getBenefit(), newsDto.getSex(), newsDto.getName_nd(), newsDto.getAddress_nd(), newsDto.getEmail_nd(), newsDto.getProfile_language(), newsDto.getProfile_requirement(), newsDto.getPhone(), newsDto.getJob_requirements(),newsDto.getQuanlity(),newsDto.getType_of_work(),newsDto.getStatus(),newsDto.getCreateDate())) {
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/get-list-category", method = RequestMethod.GET)
    public ResponseEntity<List<ICategory>> getAllCategory(){
        List<ICategory> listCategory = iCategorySer.getAllCategory();
        if(listCategory.isEmpty()){
            return new ResponseEntity<List<ICategory>>(HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<List<ICategory>>(listCategory,HttpStatus.OK);
        }
    }
}
