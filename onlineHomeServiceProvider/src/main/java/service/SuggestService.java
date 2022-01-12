package service;

import dao.SuggestDao;
import jdk.jshell.SourceCodeAnalysis;
import lombok.Data;
import models.Suggest;
import models.member.Specialist;
import org.springframework.stereotype.Service;

@Service
@Data
public class SuggestService {
    SuggestDao suggestDao;

    public void saveSuggestion(Suggest suggest) {
        suggestDao.create(suggest);
    }

    public Suggest createNewSuggest(Specialist specialist, String info) {
        String[] strings = info.split(",");
        Suggest suggest = Suggest.builder().specialist(specialist).suggestedPrice(Double.parseDouble(strings[0]))
                .durationOfWork(Long.parseLong(strings[1]))
                .startTime(Integer.parseInt(strings[2]))
                .suggestedPrice(Double.parseDouble(strings[3])).build();
        return suggest;

    }
}
