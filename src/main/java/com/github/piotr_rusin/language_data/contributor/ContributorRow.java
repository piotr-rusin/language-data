package com.github.piotr_rusin.language_data.contributor;

import com.github.piotr_rusin.language_data.DataRow;
import com.opencsv.bean.CsvBindByName;

public class ContributorRow extends DataRow {
    @CsvBindByName(column="Name")
    private String name;

    public String getName() {
        return name;
    }
}
