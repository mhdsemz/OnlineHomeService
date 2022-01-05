package config;

import dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import service.*;
import validation.UserValidation;

@Import(value = {SpringConfig.class, UserValidation.class})
@Configuration
public class ServicesSpringConfig {

    @Bean
    public CustomerService customerService(CustomerDao customerDao) {
        CustomerService customerService = new CustomerService();
        customerService.setCustomerDao(customerDao);
        return customerService;
    }

    @Bean
    public SpecialistService specialistService(SpecialistDao specialistDao) {
        SpecialistService specialistService = new SpecialistService();
        specialistService.setSpecialistDao(specialistDao);
        return specialistService;
    }

    @Bean
    public ManagerService managerService(ManagerDao managerDao) {
        ManagerService managerService = new ManagerService();
        managerService.setManagerDao(managerDao);
        return managerService;
    }

    @Bean
    public UserService userService(UserDao userDao, UserValidation userValidation, CustomerService customerService) {
        UserService userService = new UserService();
        userService.setCustomerService(customerService);
        userService.setUserValidation(userValidation);
        userService.setUserDao(userDao);
        return userService;
    }

    @Bean
    public ServiceService serviceService(ServiceDao serviceDao, UserValidation validation) {
        ServiceService serviceService = new ServiceService();
        serviceService.setServiceDao(serviceDao);
        serviceService.setUserValidation(validation);
        return serviceService;
    }
}
