package gao.internfinder.backend.controllers;
import gao.internfinder.backend.Entity.News;

import gao.internfinder.backend.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quanlybaidang")
public class NewsControllerDat {
    @Autowired
    private NewsRepository newsRepo;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<News> getAll(){
        return newsRepo.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        newsRepo.deleteById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> Edit(@RequestBody News account, @PathVariable Integer id ){
        try{
            News account1 = newsRepo.findById(id).get();
            account1.setStatus(account.getStatus());
            newsRepo.save(account1);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<News> get(@PathVariable Integer id) {
        try {
            News st = newsRepo.findById(id).get();
            return new ResponseEntity<News>(st, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<News>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping(path ="/seach/{searchtext}")
    public List<News> getSKbytext(@PathVariable String searchtext){
        String search = "%" + searchtext + "%";
        return newsRepo.findByTitle(search);
    }
    @GetMapping(path ="/seach/ntd/{searchtext}")
    public List<News> getSKbytextNtd(@PathVariable String searchtext){
        String search = "%" + searchtext + "%";
        return newsRepo.findByTitle(search);
    }
    @RequestMapping(value = "mybaidang/{id}")
    private  ResponseEntity<News> getAllbyid(@PathVariable("id") Integer id){
            try {
                List<News> cm = newsRepo.findByAccount(id);
                return  new ResponseEntity(cm, HttpStatus.OK);
            }
            catch (Exception exception){
                return  new ResponseEntity(HttpStatus.NOT_FOUND);
            }
    }

}
