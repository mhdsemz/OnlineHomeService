package service;

import dao.OrderDao;
import dao.ServiceDao;
import lombok.Data;
import models.Order;
import models.service.Service;
import validation.ServiceValidation;

import java.util.List;

@Data
public class OrderService {
    OrderDao orderDao;
    ServiceDao serviceDao;
    ServiceValidation serviceValidation;

    public boolean saveOrder(Order order) {
        orderDao.save(order);
        return true;
    }

    public void updateStatus(Order order) {
        orderDao.update(order);
    }

    public void checkNameValidation() {
        //TODO
    }

    public List<String> getAllServiceName() {
        return null;
        //TODO
    }

    public boolean addService(Service service) {
        serviceDao.create(service);
        return true;
    }
}
