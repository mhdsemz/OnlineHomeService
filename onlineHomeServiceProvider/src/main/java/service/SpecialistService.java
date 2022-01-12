package service;

import dao.SpecialistDao;
import lombok.Data;
import models.enums.UserStatus;
import models.member.Specialist;
import models.member.User;
import org.springframework.stereotype.Service;

@Service
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

    public Specialist creatNewSpecialist(String information) {
        String[] split = information.split(",");
        Specialist specialist = Specialist.builder().firstname(split[0])
                .lastname(split[1])
                .emailAddress(split[2])
                .credit(Long.parseLong(split[3]))
                .phoneNumber(split[4])
                .password(split[5])
                .userStatus(UserStatus.NEW).build();
        return specialist;

    }
}

