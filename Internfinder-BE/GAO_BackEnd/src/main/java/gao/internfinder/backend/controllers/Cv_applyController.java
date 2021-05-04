package gao.internfinder.backend.controllers;

import gao.internfinder.backend.Entity.Cv_apply;
import gao.internfinder.backend.repository.CvApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quanlycvapply")
public class Cv_applyController {
    @Autowired
    CvApplyRepository cvApplyRepository;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private ResponseEntity<Cv_apply> getAllByIDshare(@PathVariable("id") Integer id){
        try {
            List<Cv_apply> cm = cvApplyRepository.findAllByNews(id);
            return  new ResponseEntity(cm, HttpStatus.OK);
        }
        catch (Exception exception){
            return  new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    private void delete(@PathVariable Integer id){
                    cvApplyRepository.deleteById(id);
    }
}
