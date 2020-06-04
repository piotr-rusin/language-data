package com.github.piotr_rusin.language_data.language_name;

import com.github.piotr_rusin.language_data.DataRow;
import com.opencsv.bean.CsvBindByName;

public class LanguageNameRow extends DataRow {

    @CsvBindByName(column="Language_ID")
    private String languageId;
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
}
