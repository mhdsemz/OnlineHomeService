package dao;

import models.member.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
    //    private Session session;
//
//    public void save(Customer customer) {
//        if (customer == null) {
//            throw new RuntimeException("sorry customer is null!!!");
//        } else {
//            session = builderSessionFactory().openSession();
//            session.beginTransaction();
//            session.save(customer);
//            session.getTransaction().commit();
//            session.close();
//        }
//    }
//
//    public void modifyPassword(String phoneNumber, String newPassword) {
//        session = builderSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("UPDATE Customer set password=:newPassword where phoneNumber=:phoneNumber");
//        query.setParameter("newPassword", newPassword);
//        query.setParameter("phoneNumber", phoneNumber);
//        query.executeUpdate();
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    public Customer getCustomerByPhoneNumberAndPass(String phoneNumber, String password) {
//        session = builderSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("FROM Customer WHERE phoneNumber=:phoneNumber and password=:password");
//        query.setParameter("phoneNumber", phoneNumber);
//        query.setParameter("password", password);
//        Customer customer = (Customer) query.getSingleResult();
//        session.getTransaction().commit();
//        session.close();
//        return customer;
//    }
//
//    public void update(Customer customer) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.update(customer);
//        transaction.commit();
//        session.close();
//    }
    @Override
    Customer save(Customer customer);

    @Override
    void delete(Customer customer);

    Customer findByEmailAddress(String email);

}
