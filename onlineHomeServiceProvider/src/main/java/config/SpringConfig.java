package config;

import dao.CustomerDao;
import models.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.CustomerService;

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
        CustomerDao customerDao = new CustomerDao();
        return customerDao;
    }

}
