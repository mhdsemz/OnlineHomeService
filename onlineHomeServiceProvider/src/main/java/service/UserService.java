package service;

import dao.UserDao;
import lombok.Data;
import models.member.User;
import validation.UserValidation;

@Data
public class UserService {
    UserDao userDao;
    UserValidation userValidation;
    CustomerService customerService;

    public User findUserByPhoneNumber(String phoneNumber) {
        User user = userDao.findByPhoneNumber(phoneNumber);
        return user;
    }

    public User getUserByPassAndPhoneNumber(String pass, String phoneNumber) {
        User userByPhoneNumberAndPass = userDao.getUserByPhoneNumberAndPass(phoneNumber, pass);
        if (userByPhoneNumberAndPass == null) {
            throw new RuntimeException("***something is wrong!! please check again***");
        }
        return userByPhoneNumberAndPass;
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
}
