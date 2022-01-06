package service;

import dao.CommentDao;
import lombok.Data;
import models.Comment;

@Data
public class CommentService {
    CommentDao commentDao;

    public void save(Comment comment) {
        commentDao.creatComment(comment);
    }
}
