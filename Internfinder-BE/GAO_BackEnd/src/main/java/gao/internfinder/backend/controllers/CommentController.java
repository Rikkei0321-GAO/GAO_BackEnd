package gao.internfinder.backend.controllers;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Entity.Comment;
import gao.internfinder.backend.Service.CommentService;
import gao.internfinder.backend.dto.CommentDTO;

import gao.internfinder.backend.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
        @RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentRepository commentRepository;
    @GetMapping(value = "/index")
    private List<Comment> getAll(){
        return commentRepository.findAll();
    }
    @RequestMapping(value = "/{id}/{page}")
    private  ResponseEntity<Comment> getAllByIDshare( @PathVariable("id") Integer id, @PathVariable("page")int page){
        try {
            Page<Comment> cm = commentRepository.findAllByShare_experience(id,PageRequest.of(page,3));
            return  new ResponseEntity(cm, HttpStatus.OK);
        }
        catch (Exception exception){
            return  new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @Autowired
    CommentService commentService;
    @RequestMapping(value = "/create-comment", method = RequestMethod.POST)
    public ResponseEntity<Void> createCommentPost(@Valid @RequestBody CommentDTO commentDTO, UriComponentsBuilder ucBuilder) {
        commentService.createCommentPost(commentDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(commentDTO.getIdcoment()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @GetMapping("/update/{id}")
    public ResponseEntity<Comment> get(@PathVariable Integer id) {
        try {
            Comment st = commentRepository.findById(id).get();
            return new ResponseEntity<Comment>(st, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>Edit(@RequestBody Comment comment, @PathVariable Integer id ){
        try{
            Comment comment1 = commentRepository.findById(id).get();
            comment1.setContent(comment.getContent());
            commentRepository.save(comment1);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        commentRepository.deleteById(id);
    }



}
