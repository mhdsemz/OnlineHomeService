package service;

import dao.SpecialistDao;
import lombok.Data;
import models.member.Specialist;
import models.member.User;

@Data
public class SpecialistService {
    private SpecialistDao specialistDao;

    public void save(Specialist specialist) {
        specialistDao.save(specialist);
    }

    public void delete(User specialist) {
        specialistDao.delete(specialist);
    }

    public void update(User specialist) {
        specialistDao.update(specialist);
    }


}
