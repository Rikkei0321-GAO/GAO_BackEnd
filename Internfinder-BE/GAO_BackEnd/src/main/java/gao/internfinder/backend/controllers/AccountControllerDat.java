package gao.internfinder.backend.controllers;//package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quanlytaikhoan")
public class AccountControllerDat {
    @Autowired
    private AccountRepository accountRepo;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<Account> getAll(){
        return accountRepo.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        accountRepo.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>Edit(@RequestBody Account account, @PathVariable Integer id ){
        try{
            Account account1 = accountRepo.findById(id).get();
            account1.setPassword(account.getPassword());
            account1.setStatus(account.getStatus());
            accountRepo.save(account1);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable Integer id) {
        try {
            Account st = accountRepo.findById(id).get();
            return new ResponseEntity<Account>(st, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Account create( @RequestBody Account account){

        return accountRepo.save(account);
    }
}