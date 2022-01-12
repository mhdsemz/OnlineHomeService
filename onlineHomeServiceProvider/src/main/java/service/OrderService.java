package service;

import dao.OrderDao;
import dao.ServiceDao;
import lombok.Data;
import models.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class OrderService {
    OrderDao orderDao;
    ServiceDao serviceDao;

    public boolean saveOrder(Order order) {
        orderDao.save(order);
        return true;
    }

    public void updateStatus(Order order) {
        orderDao.update(order);
    }



}
