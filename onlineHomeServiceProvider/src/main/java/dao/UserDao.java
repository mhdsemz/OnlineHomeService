package dao;

import models.member.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

//    public User findByPhoneNumber(String phoneNumber) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        String hql = "from User a where a.phoneNumber=:phoneNumber";
//        Query query = session.createQuery(hql, User.class);
//        query.setParameter("phoneNumber", phoneNumber);
//        List<User> list = query.list();
//        transaction.commit();
//        session.close();
//        if (list.size() == 0)
//            return null;
//        return list.get(0);
//    }
}
