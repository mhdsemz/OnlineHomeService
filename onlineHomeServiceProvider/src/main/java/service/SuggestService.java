package service;

import dao.SuggestDao;
import jdk.jshell.SourceCodeAnalysis;
import lombok.Data;
import models.Suggest;

@Data
public class SuggestService {
    SuggestDao suggestDao;

    public void saveSuggestion(Suggest suggest) {
        suggestDao.create(suggest);
    }
}
