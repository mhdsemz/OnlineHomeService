package service;

import dao.ManagerDao;
import lombok.Data;
import models.member.Manager;
import org.springframework.stereotype.Service;

@Service
@Data
public class ManagerService {
    private  ManagerDao managerDao;

    public void save(Manager manager) {
        managerDao.save(manager);
    }
}
