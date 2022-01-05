package dao;

import models.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static dao.BaseDao.builderSessionFactory;

public class OrderDao extends BaseDao {
    private Session session;

    public void save(Order order) {
        if (order == null) {
            throw new RuntimeException("sorry order is null!!!");
        } else {
            session = builderSessionFactory().openSession();
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
            session.close();
        }
    }

    public void update(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(order);
        transaction.commit();
        session.close();
    }

    public void delete(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(order);
        transaction.commit();
        session.close();
    }
}
