package service;

import dao.ServiceDao;
import dao.SubServiceDao;
import models.service.SubService;

import java.util.List;

public class SubServiceService {
    SubServiceDao subServiceDao;

    public List<String> getAllServiceName() {
        //TODO
        return null;
    }

    public boolean validateNewName(String name) {
        //TODO
        return true;
    }

    public boolean addSubService(SubService service) {
        subServiceDao.create(service);
        return true;
    }
}
