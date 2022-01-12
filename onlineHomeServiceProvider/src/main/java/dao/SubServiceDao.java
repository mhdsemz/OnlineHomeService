package dao;

import models.service.SubService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubServiceDao extends JpaRepository<SubService, Integer> {
    @Override
    SubService save(SubService subService);

    @Override
    void delete(SubService subService);
//    public List<String> getAllName() {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        String hql = "select a.name from SubService a";
//        Query query = session.createQuery(hql, String.class);
//        List list = query.getResultList();
//        transaction.commit();
//        session.close();
//        return list;
//    }

}
