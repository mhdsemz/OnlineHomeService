package service;

import dao.OrderDao;
import lombok.Data;
import models.Order;

@Data
public class OrderService {
    OrderDao orderDao;

    public boolean saveOrder(Order order) {
        orderDao.save(order);
        return true;
    }

    public void updateStatus(Order order) {
        orderDao.update(order);
    }
}
