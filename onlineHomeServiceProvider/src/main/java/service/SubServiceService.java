package service;

import dao.SubServiceDao;
import lombok.Data;
import models.service.SubService;

import java.util.List;
@Data
public class SubServiceService {
    SubServiceDao subServiceDao;
    UserValidation userValidation;

    public List<String> getAllServiceName() {
        List<String> allName = subServiceDao.getAllName();
        return allName;
    }

    public boolean addSubService(SubService service) {
        subServiceDao.create(service);
        return true;
    }

    public boolean validateNewName(String name) {
        return userValidation.validateNewName(name, getAllServiceName());
    }
}
