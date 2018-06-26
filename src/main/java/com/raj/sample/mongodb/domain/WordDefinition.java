package com.raj.sample.mongodb.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "textProns",
        "sourceDictionary",
        "exampleUses",
        "relatedWords",
        "labels",
        "citations",
        "word",
        "sequence",
        "attributionText",
        "partOfSpeech",
        "text",
        "score"
})
public class WordDefinition {

    @JsonProperty("textProns")
    private List<Object> textProns = null;
    @JsonProperty("sourceDictionary")
    private String sourceDictionary;
    @JsonProperty("exampleUses")
    private List<Object> exampleUses = null;
    @JsonProperty("relatedWords")
    private List<Object> relatedWords = null;
    @JsonProperty("labels")
    private List<Object> labels = null;
    @JsonProperty("citations")
    private List<Object> citations = null;
    @JsonProperty("word")
    private String word;
    @JsonProperty("sequence")
    private String sequence;
    @JsonProperty("attributionText")
    private String attributionText;
    @JsonProperty("partOfSpeech")
    private String partOfSpeech;
    @JsonProperty("text")
    private String text;
    @JsonProperty("score")
    private Integer score;

    @JsonProperty("textProns")
    public List<Object> getTextProns() {
        return textProns;
    }

    @JsonProperty("textProns")
    public void setTextProns(List<Object> textProns) {
        this.textProns = textProns;
    }

    @JsonProperty("sourceDictionary")
    public String getSourceDictionary() {
        return sourceDictionary;
    }

    @JsonProperty("sourceDictionary")
    public void setSourceDictionary(String sourceDictionary) {
        this.sourceDictionary = sourceDictionary;
    }

    @JsonProperty("exampleUses")
    public List<Object> getExampleUses() {
        return exampleUses;
    }

    @JsonProperty("exampleUses")
    public void setExampleUses(List<Object> exampleUses) {
        this.exampleUses = exampleUses;
    }

    @JsonProperty("relatedWords")
    public List<Object> getRelatedWords() {
        return relatedWords;
    }

    @JsonProperty("relatedWords")
    public void setRelatedWords(List<Object> relatedWords) {
        this.relatedWords = relatedWords;
    }

    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonProperty("citations")
    public List<Object> getCitations() {
        return citations;
    }

    @JsonProperty("citations")
    public void setCitations(List<Object> citations) {
        this.citations = citations;
    }

    @JsonProperty("word")
    public String getWord() {
        return word;
    }

    @JsonProperty("word")
    public void setWord(String word) {
        this.word = word;
    }

    @JsonProperty("sequence")
    public String getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("attributionText")
    public String getAttributionText() {
        return attributionText;
    }

    @JsonProperty("attributionText")
    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    @JsonProperty("partOfSpeech")
    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    @JsonProperty("partOfSpeech")
    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WordDefinition{");
        sb.append("textProns=").append(textProns);
        sb.append(", sourceDictionary='").append(sourceDictionary).append('\'');
        sb.append(", exampleUses=").append(exampleUses);
        sb.append(", relatedWords=").append(relatedWords);
        sb.append(", labels=").append(labels);
        sb.append(", citations=").append(citations);
        sb.append(", word='").append(word).append('\'');
        sb.append(", sequence='").append(sequence).append('\'');
        sb.append(", attributionText='").append(attributionText).append('\'');
        sb.append(", partOfSpeech='").append(partOfSpeech).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}
