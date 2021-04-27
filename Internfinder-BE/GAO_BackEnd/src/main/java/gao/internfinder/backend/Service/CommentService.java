package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.Comment;
import gao.internfinder.backend.dto.CommentDTO;

public interface CommentService {
    void createCommentPost(CommentDTO commentDTO);

    void updateComment(CommentDTO commentDTO);
    Comment findbyidcoment(Integer id);
}
