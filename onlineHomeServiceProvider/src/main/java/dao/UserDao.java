package dao;

import models.member.User;
import org.hibernate.Session;

import static dao.BaseDao.builderSessionFactory;

public class UserDao {
    private Session session;

    public void save(User user) {
        if (user == null) {
            throw new RuntimeException("sorry user is null!!!");
        } else {
            session = builderSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            session.close();
        }
    }
}
