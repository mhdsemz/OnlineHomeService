package dao;

import models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
    Order save(Order order);
}

