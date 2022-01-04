package dao;

import models.Customer;
import models.Specialist;
import org.hibernate.Session;
import org.hibernate.query.Query;

import static dao.BaseDao.builderSessionFactory;

public class SpecialistDao {
    private Session session;

    public void save(Customer customer) {
        if (customer == null) {
            throw new RuntimeException("sorry customer is null!!!");
        } else {
            session = builderSessionFactory().openSession();
            session.beginTransaction();
            session.save(customer);
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

}
