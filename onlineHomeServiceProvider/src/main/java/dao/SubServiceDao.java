package dao;

import models.service.SubService;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class SubServiceDao extends BaseDao {

    public void create(SubService subService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(subService);
        transaction.commit();
        session.close();
    }

    public void update(SubService subService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(subService);
        transaction.commit();
        session.close();
    }

    public void delete(SubService subService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(subService);
        transaction.commit();
        session.close();

    }

    public List<String> getAllName() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select a.name from SubService a";
        Query query = session.createQuery(hql, String.class);
        List list = query.getResultList();
        transaction.commit();
        session.close();
        return list;
    }

}
