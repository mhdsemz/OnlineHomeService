package dao;

import models.service.Service;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Query;
import java.util.List;

@org.springframework.stereotype.Service
public interface ServiceDao extends JpaRepository<Service, Integer> {
    @Override
    Service save(Service service);

    @Override
    void delete(Service service);
//    public List<String> getListOfServicesName() {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        String hql = "select a.name from Service a";
//        Query query = session.createQuery(hql, String.class);
//        List list = query.getResultList();
//        transaction.commit();
//        session.close();
//        return list;
//    }


}
