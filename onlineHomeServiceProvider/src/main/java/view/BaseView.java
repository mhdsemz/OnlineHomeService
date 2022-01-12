package view;


import exception.InvalidInformationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

import java.util.Scanner;

public class BaseView {
    ApplicationContext context = new AnnotationConfigApplicationContext(ServicesSpringConfig.class);
    protected UserService userService = context.getBean(UserService.class);
    protected Scanner scanner = new Scanner(System.in);
    protected UserView userView = context.getBean(UserView.class);
    protected ManagerView managerView = context.getBean(ManagerView.class);
    protected CustomerView customerView = context.getBean(CustomerView.class);

    public void Menu() {
        System.out.println("select which panel do you wanna show to you  \n1.Manager \n2.User \n3.adding new customer");
        int input = scanner.nextInt();
        try {
            switch (input) {
                case 1:
                    managerView.login();
                    break;
                case 2:
                    userView.login();
                    break;
                case 3:
                    customerView.addNewCustomer();
                    break;
            }
        } catch (InvalidInformationException e) {
            System.out.println(e.getMessage());
        }
    }
}
