package gao.internfinder.backend.controller;

import gao.internfinder.backend.Entity.Category;
import gao.internfinder.backend.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/Category")

public class CategoryController {

    @Autowired
    CategoryRepository reponsitory;
    @GetMapping("/all")

    public List<Category> AllCategory(){
        return reponsitory.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCatelogy(@PathVariable Integer id) {
        try {
            Category ns = reponsitory.findById(id).get();
            return new ResponseEntity<Category>(ns, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nganh")
    public void luuNganh(@RequestBody Category category){
        reponsitory.save(category);
    }

    @DeleteMapping("/nganh/{id}")
    public void xoaNganhId(@PathVariable(name = "id")int id){
        reponsitory.deleteById(id);
    }
}
