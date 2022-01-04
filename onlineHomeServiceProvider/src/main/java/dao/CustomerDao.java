package dao;

import models.Customer;
import org.hibernate.Session;

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
}
