package service;

import dao.CommentDao;
import lombok.Data;
import models.Comment;
import org.springframework.stereotype.Service;

@Service
@Data
public class CommentService {
    CommentDao commentDao;

    public void save(Comment comment) {
        commentDao.save(comment);
    }
}
