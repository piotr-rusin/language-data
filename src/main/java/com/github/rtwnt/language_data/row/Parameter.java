package com.github.rtwnt.language_data.row;

import com.github.rtwnt.language_data.DuplicateRowIdException;
import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.util.Map;

public class Parameter extends DataRow {

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

    public static Map<String, Parameter> readAllFromFile(String path) throws FileNotFoundException, DuplicateRowIdException {
        return readAllFromFile(path, Parameter.class);
    }
}
