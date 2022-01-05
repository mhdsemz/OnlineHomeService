package dao;

import models.member.Specialist;
import models.member.User;
import models.service.SubService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import static dao.BaseDao.builderSessionFactory;

public class SpecialistDao extends UserDao {
    private Session session;

    public void save(Specialist specialist) {
        if (specialist == null) {
            throw new RuntimeException("sorry specialist is null!!!");
        } else {
            session = builderSessionFactory().openSession();
            session.beginTransaction();
            session.save(specialist);
            session.getTransaction().commit();
            session.close();
        }
    }

    public Specialist getSpecialistByPhoneNumberAndPass(String phoneNumber, String password) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM Specialist WHERE phoneNumber=:phoneNumber and password=:password");
        query.setParameter("phoneNumber", phoneNumber);
        query.setParameter("password", password);
        Specialist specialist = (Specialist) query.getSingleResult();
        session.getTransaction().commit();
        session.close();
        return specialist;
    }

    public void modifyPassword(String phoneNumber, String newPassword) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("UPDATE Specialist set password=:newPassword where phoneNumber=:phoneNumber");
        query.setParameter("newPassword", newPassword);
        query.setParameter("phoneNumber", phoneNumber);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    public void update(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }
}
