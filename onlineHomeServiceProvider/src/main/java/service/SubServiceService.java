package service;

import dao.ServiceDao;
import dao.SubServiceDao;
import models.service.SubService;
import validation.UserValidation;

import java.util.List;

public class SubServiceService {
    SubServiceDao subServiceDao;
    UserValidation userValidation;

    public List<String> getAllServiceName() {
        List<String> allName = subServiceDao.getAllName();
        return allName;
    }

    public boolean validateNewName(String name) {
        return userValidation.validateNewName(name, getAllServiceName());
    }

    public boolean addSubService(SubService service) {
        subServiceDao.create(service);
        return true;
    }
}
