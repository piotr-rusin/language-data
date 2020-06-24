package com.github.rtwnt.language_data.row;

import com.github.rtwnt.language_data.DataReader;
import com.github.rtwnt.language_data.DuplicateRowIdException;
import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public abstract class DataRow {
    @CsvBindByName(column="ID")
    protected String id;

    public DataRow(DataRow other) {
        this.id = other.id;
    }

    public String getId() {
        return id;
    }

    protected static <T extends DataRow> Map<String, T> readAllFromFile(String path, Class<T> rowClass) throws FileNotFoundException, DuplicateRowIdException {
        return new DataReader<>(rowClass).readDataMappedById(new FileReader(path));
    }
}
