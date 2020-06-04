package com.github.piotr_rusin.language_data;

import com.opencsv.bean.CsvBindByName;

public abstract class DataRow {
    @CsvBindByName(column="ID")
    protected String id;

    public String getId() {
        return id;
    }
}
