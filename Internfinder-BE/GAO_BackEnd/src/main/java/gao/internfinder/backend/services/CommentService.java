package gao.internfinder.backend.services;

import gao.internfinder.backend.dto.CommentDTO;

public interface CommentService {
    void createCommentPost(CommentDTO commentDTO);
}
