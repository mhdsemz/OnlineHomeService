package service;

import dao.UserDao;
import lombok.Data;
import models.member.User;

@Data
public class UserService {
    UserDao userDao;

    public User findUserByPhoneNumberAndPass(String phoneNumber) {
        User user = userDao.findByPhoneNumber(phoneNumber);
        return user;
    }
}