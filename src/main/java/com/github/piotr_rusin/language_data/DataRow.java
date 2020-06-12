package com.github.piotr_rusin.language_data;

import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public abstract class DataRow {
    @CsvBindByName(column="ID")
    protected String id;

    public String getId() {
        return id;
    }

    protected static <T extends DataRow> Map<String, T> readAllFromFile(String path, Class<T> rowClass) throws FileNotFoundException, DuplicateRowIdException {
        return new DataReader<>(rowClass).readDataMappedById(new FileReader(path));
    }
}
