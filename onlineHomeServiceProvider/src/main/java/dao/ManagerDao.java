package dao;

import models.member.Manager;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import static dao.BaseDao.builderSessionFactory;

@Repository
public interface ManagerDao extends JpaRepository<Manager, Integer> {
    @Override
    Manager save(Manager manager);


}
