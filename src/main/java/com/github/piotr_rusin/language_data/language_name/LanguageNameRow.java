package com.github.piotr_rusin.language_data.language_name;

import com.github.piotr_rusin.language_data.DataRow;
import com.github.piotr_rusin.language_data.language.LanguageRow;
import com.opencsv.bean.CsvBindByName;

public class LanguageNameRow extends DataRow {

    @CsvBindByName(column="Language_ID")
    private String languageId;
    private LanguageRow languageData;

    @CsvBindByName(column="Name")
    private String name;
    @CsvBindByName(column="Provider")
    private String provider;

    public String getLanguageId() {
        return languageId;
    }

    public String getName() {
        return name;
    }

    public String getProvider() {
        return provider;
    }

    public LanguageRow getLanguageData() {
        return languageData;
    }
}
