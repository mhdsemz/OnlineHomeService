package service;

import dao.CustomerDao;
import lombok.Data;
import models.member.Customer;

@Data
public class CustomerService {
    private final CustomerDao customerDao;

    public void save(Customer customer) {
        customerDao.save(customer);
    }


}
