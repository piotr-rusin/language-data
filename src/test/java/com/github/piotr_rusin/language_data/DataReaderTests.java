package com.github.piotr_rusin.language_data;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class DataReaderTests {

    FileReader fileReader;

    @BeforeEach
    public void prepareFileReader() throws FileNotFoundException {
        fileReader = new FileReader("src/test/resources/csv/test.csv");
    }

    @Test
    public void readDataReadsEmptyCharacterAsNull() {
        List<TestRow> rows = DataReader.readData(fileReader, TestRow.class);
        Assertions.assertThat(rows).isNotEmpty();
        Assertions.assertThat(rows.get(0).getSecond()).isNull();
    }

    @Test
    public void readDataReadsBackslash() {
        List<TestRow> rows = DataReader.readData(fileReader, TestRow.class);
        Assertions.assertThat(rows).isNotEmpty();
        Assertions.assertThat(rows.get(0).getFirst()).isEqualTo("test\\tvalue");
    }
}
