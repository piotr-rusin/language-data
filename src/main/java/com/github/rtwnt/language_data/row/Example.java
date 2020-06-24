package com.github.rtwnt.language_data.row;

import com.github.rtwnt.language_data.DuplicateRowIdException;
import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.util.Map;

public class Example extends DataRow {
    @CsvBindByName(column="Language_ID")
    private String languageId;
    @CsvBindByName(column="Primary_Text")
    private String primaryText;
    @CsvBindByName(column="Analyzed_Word")
    private String analyzedWord;
    @CsvBindByName(column="Gloss")
    private String gloss;
    @CsvBindByName(column="Translated_Text")
    private String translatedText;
    @CsvBindByName(column="Meta_Language_ID")
    private String metaLanguageId;
    @CsvBindByName(column="Comment")
    private String comment;

    public Example(){}

    public Example(Example other) {
        super(other);
        this.languageId = other.languageId;
        this.primaryText = other.primaryText;
        this.analyzedWord = other.analyzedWord;
        this.gloss = other.gloss;
        this.translatedText = other.translatedText;
        this.metaLanguageId = other.metaLanguageId;
        this.comment = other.comment;
    }

    public String getLanguageId() {
        return languageId;
    }

    public String getPrimaryText() {
        return primaryText;
    }

    public String getAnalyzedWord() {
        return analyzedWord;
    }

    public String getGloss() {
        return gloss;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public String getMetaLanguageId() {
        return metaLanguageId;
    }

    public String getComment() {
        return comment;
    }

    public static Map<String, Example> readAllFromFile(String path) throws FileNotFoundException, DuplicateRowIdException {
        return readAllFromFile(path, Example.class);
    }
}
