package service;

import dao.ManagerDao;
import lombok.Data;
import models.member.Manager;

@Data
public class ManagerService {
    private  ManagerDao managerDao;

    public void save(Manager manager) {
        managerDao.save(manager);
    }
}
