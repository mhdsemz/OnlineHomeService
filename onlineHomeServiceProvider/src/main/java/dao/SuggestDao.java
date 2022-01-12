package dao;

import models.Suggest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestDao extends JpaRepository<Suggest, Integer> {
    @Override
    Suggest save(Suggest suggest);


}
