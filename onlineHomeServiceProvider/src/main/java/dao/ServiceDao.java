package dao;

import models.Suggest;
import models.service.Service;
import org.hibernate.Session;

public class ServiceDao extends BaseDao {
    private Session session;

    public void creat(Service service) {
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

}
