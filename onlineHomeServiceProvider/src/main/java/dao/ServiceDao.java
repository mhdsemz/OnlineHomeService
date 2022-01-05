package dao;

import models.service.Service;
import org.hibernate.Session;


public class ServiceDao extends BaseDao {
    private Session session;

    public void create(Service service) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        session.save(service);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Service service) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        session.delete(service);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Service service) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        session.update(service);
        session.getTransaction().commit();
        session.close();
    }

//    public List<String> getListOfServicesName() {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        String hql = "select a.name from Service a";
//        Query query = session.createQuery(hql, String.class);
//        List<String> list = query.list();
//        transaction.commit();
//        session.close();
//        return list;
//    }


}
