package dao;

import models.member.Customer;
import models.member.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class UserDao extends BaseDao {
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

    public void create(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(user);
        transaction.commit();
        session.close();
    }

    public User findByPhoneNumber(String phoneNumber) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from User a where a.phoneNumber=:phoneNumber";
        Query query = session.createQuery(hql, User.class);
        query.setParameter("phoneNumber", phoneNumber);
        List list = query.getResultList();
        transaction.commit();
        session.close();
        return (User) list;
    }

    public User getUserByPhoneNumberAndPass(String phoneNumber, String password) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        org.hibernate.query.Query query = session.createQuery("FROM User WHERE phoneNumber=:phoneNumber and password=:password");
        query.setParameter("phoneNumber", phoneNumber);
        query.setParameter("password", password);
        User user = (User) query.getSingleResult();
        session.getTransaction().commit();
        session.close();
        return user;
    }
}
