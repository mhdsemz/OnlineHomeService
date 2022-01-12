package dao;

import models.Comment;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class CommentDao extends BaseDao {
    private Session session;

    public void creatComment(Comment comment) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        session.save(comment);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteComment(Comment comment) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        session.delete(comment);
        session.getTransaction().commit();
        session.close();
    }


}
