package service;

import dao.SpecialistDao;
import lombok.Data;
import models.enums.UserStatus;
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
//
//    public Specialist creatNewSpecialist(String information) {
//        String[] split = information.split(",");
//        Specialist specialist = Specialist.builder()
//                .firstname(split[0])
//                .lastName(split[1])
//                .email(split[2])
//                .password(split[3])
//                .phoneNumber(split[4])
//                .userStatus(UserStatus.NEW)
//                .credit(Double.parseDouble(split[5]))
//                .build();
//        return specialist;
//    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //cheraaaaaaaaaaaaa builder kar nemikoneeeeeeeeeeeeeeeeee
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}

