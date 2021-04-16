package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.Comment;
import gao.internfinder.backend.Repository.CommentRepository;
import gao.internfinder.backend.dto.CommentDTO;
import gao.internfinder.backend.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

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
    @RequestMapping(value = "/{id}")
    private  ResponseEntity<Comment> getAllByIDshare( @PathVariable Integer id){
        try {
            List<Comment> cm = commentRepository.findAllByShare_experience(id);
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

}
