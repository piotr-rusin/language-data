package com.github.piotr_rusin.language_data.example;

import com.github.piotr_rusin.language_data.Entity;
import com.github.piotr_rusin.language_data.language.Language;

import java.util.Map;

public class Example extends Entity {
    private Language language;
    private String primaryText;
    private String analyzedWord;
    private String gloss;
    private String translatedText;
    private String metaLanguageId;
    private String comment;

    public Example(ExampleRow row, Map<String, Language> languagesById) {
        super(row.getId());
        this.primaryText = row.getPrimaryText();
        this.analyzedWord = row.getAnalyzedWord();
        this.gloss = row.getGloss();
        this.translatedText = row.getTranslatedText();
        this.metaLanguageId = row.getMetaLanguageId();
        this.comment = row.getComment();

        this.language = languagesById.get(row.getLanguageId());
    }

    public Language getLanguage() {
        return language;
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
