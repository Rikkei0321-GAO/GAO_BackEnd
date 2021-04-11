package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.News;
import gao.internfinder.backend.Repository.NewsRepo_Dat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quanlybaidang")
public class NewsController_dat {
    @Autowired
    private NewsRepo_Dat newsRepo_dat;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<News> getAll(){
        return  newsRepo_dat.findAll();
    }
}
