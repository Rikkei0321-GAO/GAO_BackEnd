package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.News;
import gao.internfinder.backend.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/news")
public class NewsMHController {

    @Autowired
    NewsRepository reponsitory;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<News> getNewsAll(){
        return reponsitory.findAll();
    }

    @PostMapping(value = "/add")
    public void addNews(@RequestBody News st){
        reponsitory.save(st);
    }


    @DeleteMapping("/delete/{idNews}")
    public void deleteNews(@PathVariable Integer idNews) {
        reponsitory.deleteById(idNews);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateNews(@RequestBody News st, @PathVariable Integer idNews) {
        try {
            News ns = reponsitory.findById(idNews).get();
            ns.setIdNews(st.getIdNews());
            ns.setDecriptions(st.getDecriptions());
            ns.setTitle(st.getTitle());
            ns.setJob_requirements(st.getJob_requirements());
            ns.setIdNews(st.getIdNews());
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

            reponsitory.save(ns);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{idNews}")
    public ResponseEntity<News>getNews(@PathVariable Integer idNews) {
        try {
            News ns = reponsitory.findById(idNews).get();
            return new ResponseEntity<News>(ns, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<News>(HttpStatus.NOT_FOUND);
        }
    }
}
