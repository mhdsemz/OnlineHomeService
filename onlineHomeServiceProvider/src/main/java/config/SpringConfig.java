package config;

import dao.CustomerDao;
import dao.OrderDao;
import dao.UserDao;
import models.member.Specialist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"dao", "service"})
public class SpringConfig {
//    @Bean
//    public CustomerService customerService(CustomerDao customerDao) {
//        CustomerService customerService = new CustomerService();
//        customerService.setCustomerDao(customerDao);
//    }

    @Bean
    public CustomerDao customerDao() {
        return new CustomerDao();
    }

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public OrderDao orderDao() {
        return new OrderDao();
    }

    @Bean
    public Specialist specialistDao() {
        return new Specialist();
    }



}
