package com.github.piotr_rusin.language_data.parameter;

import com.github.piotr_rusin.language_data.DataRow;
import com.opencsv.bean.CsvBindByName;

public class ParameterRow extends DataRow {

    @CsvBindByName(column="Contributor_ID")
    private String contributorId;
    @CsvBindByName(column="Name")
    private String name;
    @CsvBindByName(column="Description")
    private String description;
    @CsvBindByName(column="Chapter")
    private String chapter;
    @CsvBindByName(column="Area")
    private String area;

    public String getContributorId() {
        return contributorId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getChapter() {
        return chapter;
    }

    public String getArea() {
        return area;
    }
}