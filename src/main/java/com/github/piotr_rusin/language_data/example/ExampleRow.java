package com.github.piotr_rusin.language_data.example;

import com.github.piotr_rusin.language_data.DataRow;
import com.opencsv.bean.CsvBindByName;

public class ExampleRow extends DataRow {
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
}
