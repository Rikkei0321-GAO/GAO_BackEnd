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
    @GetMapping(path ="/seach/{searchtext}")
    public List<Account> getSKbytext(@PathVariable String searchtext){
        String search = "%" + searchtext + "%";
        return accountRepo.findByAddress(search);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        accountRepo.deleteById(id);
    }

    @PutMapping("/admin/{id}")
    public  ResponseEntity<?> editadmin(@RequestBody Account account, @PathVariable Integer id){
        try {
            Account account1 = accountRepo.findById(id).get();
            account1.setStatus(account.getStatus());
            accountRepo.save(account1);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?>Edit(@RequestBody Account account, @PathVariable Integer id ){
        try{
            Account account1 = accountRepo.findById(id).get();
            account1.setFullName(account.getFullName());
            account1.setAddress(account .getAddress());
            account1.setBirthday(account.getBirthday());
            account1.setCompanyName(account.getCompanyName());
            account1.setCreateDate(account.getCreateDate());
            account1.setEmail(account.getEmail());
            account1.setEmail_contact(account.getEmail_contact());
            account1.setSex(account.getSex())       ;
            account1.setNameContact(account.getNameContact());
            account1.setLink(account.getLink());
            account1.setPhone(account.getPhone());
            account1.setImage(account.getImage());
            account1.setWebsite(account.getWebsite());
            account1.setCompany_address(account.getCompany_address());
            account1.setPostion(account.getPostion());
            account1.setTaxCode(account.getTaxCode());
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