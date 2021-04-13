package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Entity.News;
import gao.internfinder.backend.Repository.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quanlybaidang")
public class NewsDatContoller {
    @Autowired
    private NewsRepo newsRepo;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<News> getAll(){
        return newsRepo.findAll();
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public News create(@RequestBody News news){

        return newsRepo.save(news);
    }
}
