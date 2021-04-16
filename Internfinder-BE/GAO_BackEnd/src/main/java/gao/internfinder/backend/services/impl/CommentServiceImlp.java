package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Repository.CommentRepository;
import gao.internfinder.backend.dto.CommentDTO;
import gao.internfinder.backend.services.CommentService;
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
}
