package com.github.piotr_rusin.language_data;

import com.github.piotr_rusin.language_data.row.DataRow;
import com.opencsv.bean.CsvBindByName;

public class TestRow extends DataRow {

    @CsvBindByName(column="first")
    private String first;
    @CsvBindByName(column="second")
    private String second;

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}
