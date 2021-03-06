package gao.internfinder.backend.Service.Imp;


import gao.internfinder.backend.Entity.Comment;
import gao.internfinder.backend.Service.CommentService;
import gao.internfinder.backend.dto.CommentDTO;
import gao.internfinder.backend.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImlp implements CommentService {
    @Autowired
    CommentRepository commentRepository;


    @Override
    public void createCommentPost(CommentDTO commentDTO) {
        commentRepository.createCommentPost(
                commentDTO.getContent(), commentDTO.getCreate_date(),commentDTO.getId_account(),commentDTO.getId_share(),commentDTO.getIdcoment());
    }

    @Override
    public void updateComment(CommentDTO commentDTO) {
        commentRepository.updateComment(commentDTO.getContent(), commentDTO.getIdcoment());
    }

    @Override
    public Comment findbyidcoment(Integer id) {
            return commentRepository.findByIdcoment(id);
    }

}
