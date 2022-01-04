package dao;

import models.Manager;
import models.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static dao.BaseDao.builderSessionFactory;

public class OrderDao {
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
}
