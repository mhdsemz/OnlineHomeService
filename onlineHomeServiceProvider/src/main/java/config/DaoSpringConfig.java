package config;

import dao.*;
import models.member.Specialist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"dao", "service"})
public class DaoSpringConfig {
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
    public SpecialistDao specialistDao() {
        return new SpecialistDao();
    }

    @Bean
    public CommentDao commentDao() {
        return new CommentDao();
    }

    @Bean
    public ManagerDao managerDao() {
        return new ManagerDao();
    }

    @Bean
    public ServiceDao serviceDao() {
        return new ServiceDao();
    }

    @Bean
    public SubServiceDao SubServiceDao() {
        return new SubServiceDao();
    }

    @Bean
    public SuggestDao suggestDao() {
        return new SuggestDao();
    }

}
