package gao.internfinder.backend.controllers;

import gao.internfinder.backend.Entity.Category;
import gao.internfinder.backend.Entity.Comment;
import gao.internfinder.backend.Entity.Cv_apply;
import gao.internfinder.backend.Entity.News;
import gao.internfinder.backend.Service.CategorySer;
import gao.internfinder.backend.Service.NewsService;
import gao.internfinder.backend.repository.CreateNewsRepository;
import gao.internfinder.backend.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/news")
public class    NewsController {

    @Autowired
    private NewsService newsService;


    @Autowired
    private CategorySer categorySer;
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private CreateNewsRepository createNewsRepository;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<News> getAll(){
        return newsRepository.findAll();
    }

    @RequestMapping(value = "/newsGetOneAccount/{idAccount}", method = RequestMethod.GET)
    public ResponseEntity<List<News>> getOneAccountPost(@PathVariable int idAccount){
        List<News> list = newsService.findPostOneAccount(idAccount);
        if (list.isEmpty()) {
            return new ResponseEntity<List<News>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }



    @GetMapping("/{id}")
    public ResponseEntity<News> get(@PathVariable Integer id) {
        try {
            News st = newsRepository.findById(id).get();
            return new ResponseEntity<News>(st, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<News>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>Edit(@RequestBody News st, @PathVariable Integer id ){
        try{
            News ns = newsRepository.findById(id).get();
            ns.setDecriptions(st.getDecriptions());
            ns.setTitle(st.getTitle());
            ns.setJob_requirements(st.getJob_requirements());
            ns.setQuanlity(st.getQuanlity());
            ns.setPosition(st.getPosition());
            ns.setSalary(st.getSalary());
            ns.setWork_loaction(st.getWork_loaction());
            ns.setDegree(st.getDegree());
            ns.setMajor(st.getMajor());
            ns.setWorking_time(st.getWorking_time());
            ns.setBenefit(st.getBenefit());
            ns.setAccount(st.getAccount());
            ns.setName_nd(st.getName_nd());
            ns.setType_of_work(st.getType_of_work());
            ns.setSex(st.getSex());
            ns.setAddress_nd(st.getAddress_nd());
            ns.setEmail_nd(st.getEmail_nd());
            ns.setProfile_language(st.getProfile_language());
            ns.setProfile_requirement(st.getProfile_requirement());
            ns.setPhone(st.getPhone());
            ns.setCategory(st.getCategory());
            newsRepository.save(ns);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/categorylist",method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getAllCategory(){
        return new ResponseEntity<List<Category>>(categorySer.findAllCategory(),HttpStatus.OK);
    }


    @RequestMapping(value = "/allNews",method = RequestMethod.GET)
    public ResponseEntity<List<News>>findAllDay(){
        return new ResponseEntity<List<News>>(newsService.findAllDay(),HttpStatus.OK);
    }

}


