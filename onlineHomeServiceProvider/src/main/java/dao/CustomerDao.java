package dao;

import models.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class CustomerDao extends BaseDao {
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

    public void modifyPassword(String phoneNumber, String newPassword) {
        session = builderSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("UPDATE Customer set password=:newPassword where phoneNumber=:phoneNumber");
        query.setParameter("newPassword", newPassword);
        query.setParameter("phoneNumber", phoneNumber);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
