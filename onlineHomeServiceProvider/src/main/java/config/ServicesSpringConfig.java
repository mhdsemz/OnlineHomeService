package config;

import dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import service.*;
import validation.UserValidation;

@Import(value = {DaoSpringConfig.class, ValidationSpringConfig.class})
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

    @Bean
    public SubServiceService subServiceService(SubServiceDao subServiceDao, UserValidation userValidation) {
        SubServiceService subServiceService = new SubServiceService();
        subServiceService.setSubServiceDao(subServiceDao);
        subServiceService.setUserValidation(userValidation);
        return subServiceService;
    }

    @Bean
    public CommentService commentService(CommentDao commentDao) {
        CommentService commentService = new CommentService();
        commentService.setCommentDao(commentDao);
        return commentService;
    }

    @Bean
    public SuggestService suggestService(SuggestDao suggestDao) {
        SuggestService suggestService1 = new SuggestService();
        suggestService1.setSuggestDao(suggestDao);
        return suggestService1;
    }
}
