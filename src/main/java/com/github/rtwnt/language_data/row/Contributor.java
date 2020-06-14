package com.github.rtwnt.language_data.row;

import com.github.rtwnt.language_data.DuplicateRowIdException;
import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.util.Map;

public class Contributor extends DataRow {
    @CsvBindByName(column="Name")
    private String name;

    public String getName() {
        return name;
    }

    public static Map<String, Contributor> readAllFromFile(String path) throws FileNotFoundException, DuplicateRowIdException {
        return readAllFromFile(path, Contributor.class);
    }
}
