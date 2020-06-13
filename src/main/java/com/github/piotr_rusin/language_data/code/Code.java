package com.github.piotr_rusin.language_data.code;

import com.github.piotr_rusin.language_data.DataRow;
import com.github.piotr_rusin.language_data.DuplicateRowIdException;
import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.util.Map;

public class Code extends DataRow {

    @CsvBindByName(column="Parameter_ID")
    private String parameterId;
    @CsvBindByName(column="Name")
    private String name;
    @CsvBindByName(column="Description")
    private String description;
    @CsvBindByName(column="Number")
    private String number;
    @CsvBindByName(column="icon")
    private String icon;

    public String getParameterId() {
        return parameterId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public String getIcon() {
        return icon;
    }

    public static Map<String, Code> readAllFromFile(String path) throws FileNotFoundException, DuplicateRowIdException {
        return readAllFromFile(path, Code.class);
    }
}
