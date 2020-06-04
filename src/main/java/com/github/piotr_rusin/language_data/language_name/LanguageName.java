package com.github.piotr_rusin.language_data.language_name;

import com.github.piotr_rusin.language_data.Entity;
import com.github.piotr_rusin.language_data.language.Language;

import java.util.Map;

public class LanguageName extends Entity {

    private Language language;

    private String name;
    private String provider;

    public LanguageName(LanguageNameRow row, Map<String, Language> languagesById) {
        super(row.getId());
        this.name = row.getName();
        this.provider = row.getProvider();

        this.language = languagesById.get(row.getLanguageId());
    }

    public Language getLanguage() {
        return language;
    }

    public String getName() {
        return name;
    }

    public String getProvider() {
        return provider;
    }
}
