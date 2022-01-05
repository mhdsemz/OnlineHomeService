package service;

import dao.ServiceDao;
import dao.UserDao;
import lombok.Data;

import models.member.User;
import models.service.Service;
import validation.UserValidation;

import java.util.List;

@Data
public class ServiceService {
    ServiceDao serviceDao;
    UserValidation userValidation;
    CustomerService customerService;
    UserDao userDao;


    public boolean createService(Service service) {
        serviceDao.create(service);
        return true;
    }

    public List<String> getListOfServicesNames() {
        return serviceDao.getListOfServicesName();
    }

    public boolean checkNameValidationOfService(String name) {
        return userValidation.validateNewName(name, getListOfServicesNames());
    }

    //need to check this
    public void changePassword(String oldPass, String newPass, User user) {
        if (userValidation.checkIfPassIsTrue(oldPass, user.getPassword())) {
            if (userValidation.validatePassword(newPass)) {
                customerService.changePassword(newPass, user);
            }
        }
        System.out.println("something is wrong!!!");
    }

    public User getUserByPassAndPhoneNumber(String pass, String phoneNumber) {
        User userByPhoneNumberAndPass = userDao.getUserByPhoneNumberAndPass(phoneNumber, pass);
        if (userByPhoneNumberAndPass == null) {
            throw new RuntimeException("***something is wrong!! please check again***");
        }
        return userByPhoneNumberAndPass;
    }
}
