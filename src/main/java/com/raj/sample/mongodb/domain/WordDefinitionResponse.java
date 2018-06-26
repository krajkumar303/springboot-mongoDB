package com.raj.sample.mongodb.domain;

import java.util.List;

public class WordDefinitionResponse {

    private List<WordDefinition> wordDefinitionList;

    public List<WordDefinition> getWordDefinitionList() {
        return wordDefinitionList;
    }

    public void setWordDefinitionList(List<WordDefinition> wordDefinitionList) {
        this.wordDefinitionList = wordDefinitionList;
    }
}
