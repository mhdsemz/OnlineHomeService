package dao;

import models.Comment;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface CommentDao extends JpaRepository<Comment, Integer> {
    @Override
    Comment save(Comment comment);
}
