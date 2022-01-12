package dao;

import models.member.Specialist;
import models.member.User;
import models.service.SubService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import static dao.BaseDao.builderSessionFactory;
@Repository
public interface SpecialistDao extends JpaRepository<Specialist,Integer> {



//
//    public Specialist getSpecialistByPhoneNumberAndPass(String phoneNumber, String password) {
//        session = builderSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("FROM Specialist WHERE phoneNumber=:phoneNumber and password=:password");
//        query.setParameter("phoneNumber", phoneNumber);
//        query.setParameter("password", password);
//        Specialist specialist = (Specialist) query.getSingleResult();
//        session.getTransaction().commit();
//        session.close();
//        return specialist;
//    }
//
//    public void modifyPassword(String phoneNumber, String newPassword) {
//        session = builderSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("UPDATE Specialist set password=:newPassword where phoneNumber=:phoneNumber");
//        query.setParameter("newPassword", newPassword);
//        query.setParameter("phoneNumber", phoneNumber);
//        query.executeUpdate();
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    public void update(User user) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.update(user);
//        transaction.commit();
//        session.close();
//    }
}
