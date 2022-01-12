package service;

import dao.CustomerDao;
import lombok.Data;
import models.enums.UserStatus;
import models.member.Customer;
import models.member.User;

@Data
public class CustomerService {
    private CustomerDao customerDao;

    public void save(Customer customer) {
        customerDao.save(customer);
    }

    public Customer findByEmail(String email) {
        Customer customer = customerDao.findByEmailAddress(email);
        return customer;
    }

    public void changePassword(String newPass, User user) {
        user.setPassword(newPass);
        customerDao.update((Customer) user);
    }

//    public Customer findByPhoneNumber(String phoneNumber, String password) {
//        Customer customer = customerDao.getCustomerByPhoneNumberAndPass(phoneNumber, password);
//        return customer;
//    }

    public Customer createNewCustomer(String customerInfo) {
        String[] strings = customerInfo.split(",");
        Customer customer = Customer.builder().firstname(strings[0])
                .lastname(strings[1])
                .phoneNumber(strings[2])
                .emailAddress(strings[3])
                .credit(Long.parseLong(strings[4]))
                .password(strings[5])
                .userStatus(UserStatus.NEW).build();
        return customer;
    }
}
