package service;

import dao.OrderDao;
import dao.ServiceDao;
import lombok.Data;
import models.Order;
import org.springframework.stereotype.Service;


@Service
@Data
public class OrderService {
    OrderDao orderDao;
    ServiceDao serviceDao;

    public boolean saveOrder(Order order) {
        orderDao.save(order);
        return true;
    }

}
