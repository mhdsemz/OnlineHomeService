package dao;

import models.Manager;
import models.Specialist;
import org.hibernate.Session;

import static dao.BaseDao.builderSessionFactory;

public class ManagerDao {
    private Session session;

    public void save(Manager manager) {
        if (manager == null) {
            throw new RuntimeException("sorry manager is null!!!");
        } else {
            session = builderSessionFactory().openSession();
            session.beginTransaction();
            session.save(manager);
            session.getTransaction().commit();
            session.close();
        }
    }
    
}
