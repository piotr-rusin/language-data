package com.github.piotr_rusin.language_data.contributor;

import com.github.piotr_rusin.language_data.DataRow;
import com.github.piotr_rusin.language_data.DuplicateRowIdException;
import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.util.Map;

public class ContributorRow extends DataRow {
    @CsvBindByName(column="Name")
    private String name;

    public String getName() {
        return name;
    }

    public static Map<String, ContributorRow> readAllFromFile(String path) throws FileNotFoundException, DuplicateRowIdException {
        return readAllFromFile(path, ContributorRow.class);
    }
}
