package service;

import dao.SpecialistDao;
import lombok.Data;
import models.Specialist;

@Data
public class SpecialistService {
    private final SpecialistDao specialistDao;

    public void save( Specialist specialist){
     specialistDao.save(specialist);
    }

}
