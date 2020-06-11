package com.github.piotr_rusin.language_data.parameter;

import com.github.piotr_rusin.language_data.DataRow;
import com.github.piotr_rusin.language_data.contributor.ContributorRow;
import com.opencsv.bean.CsvBindByName;

import java.util.Map;

public class ParameterRow extends DataRow {

    @CsvBindByName(column="Contributor_ID")
    private String contributorId;
    private ContributorRow contributorData;

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

    public ContributorRow getContributorData() {
        return contributorData;
    }

    public void populateContributorData(Map<String, ContributorRow> contributorRowMap) {
        this.contributorData = contributorRowMap.get(this.contributorId);
    }
}
