package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.Share_experience;
import gao.internfinder.backend.Repository.ShareExRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/dangbaichiase")
public class ShareEXController {
    @Autowired
    private ShareExRepo shareExRepo;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<Share_experience> getAll(){
        return shareExRepo.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        shareExRepo.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> Edit(@RequestBody Share_experience account, @PathVariable Integer id ){
        try{
            Share_experience account1 = shareExRepo.findById(id).get();
            account1.setTitle(account.getTitle());
            account1.setContent(account.getContent());
            shareExRepo.save(account1);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Share_experience> get(@PathVariable Integer id) {
        try {
            Share_experience st = shareExRepo.findById(id).get();
            return new ResponseEntity<Share_experience>(st, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Share_experience>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Share_experience create( @RequestBody Share_experience share_experience){

        return shareExRepo.save(share_experience);
    }
}
