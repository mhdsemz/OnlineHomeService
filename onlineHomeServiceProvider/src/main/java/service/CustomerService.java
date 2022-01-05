package service;

import dao.CustomerDao;
import lombok.Data;
import models.member.Customer;
import models.member.User;

@Data
public class CustomerService {
    private CustomerDao customerDao;

    public void save(Customer customer) {
        customerDao.save(customer);
    }

    public void changePassword(String newPass, User user) {
        user.setPassword(newPass);
        customerDao.update((Customer) user);
    }

    public Customer findByPhoneNumber(String phoneNumber, String password) {
        Customer customer = customerDao.getCustomerByPhoneNumberAndPass(phoneNumber, password);
        return customer;
    }


}
