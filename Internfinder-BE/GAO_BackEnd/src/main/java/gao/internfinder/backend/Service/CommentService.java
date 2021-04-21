package gao.internfinder.backend.Service;

import gao.internfinder.backend.dto.CommentDTO;

public interface CommentService {
    void createCommentPost(CommentDTO commentDTO);
}
