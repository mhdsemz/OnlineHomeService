package dao;

import models.Comment;
import models.Suggest;
import org.hibernate.Session;

public class SuggestDao extends BaseDao {
    private Session session;

    public void creat(Suggest suggest) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        session.save(suggest);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Suggest suggest) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        session.delete(suggest);
        session.getTransaction().commit();
        session.close();
    }

}
