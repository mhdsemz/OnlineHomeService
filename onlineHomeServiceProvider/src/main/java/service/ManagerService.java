package service;

import dao.ManagerDao;
import lombok.Data;
import models.member.Manager;

@Data
public class ManagerService {
    private final ManagerDao managerDao;

    public void save(Manager manager) {
        managerDao.save(manager);
    }
}
