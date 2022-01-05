package service;

import dao.ServiceDao;
import lombok.Data;

import models.service.Service;
import validation.UserValidation;

import java.util.List;

@Data
public class ServiceService {
    ServiceDao serviceDao;
    UserValidation userValidation;

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

}
