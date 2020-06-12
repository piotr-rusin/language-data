package com.github.piotr_rusin.language_data;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;

public class DataReaderTests {

    DataReader<TestRow> dataReader;

    @BeforeEach
    public void prepareDataReader() {
        dataReader = new DataReader<>(TestRow.class);
    }

    protected Reader prepareFileReader(String fileName) throws FileNotFoundException {
        return new FileReader("src/test/resources/csv/" + fileName + ".csv");
    }

    @Test
    public void readDataReadsEmptyCharacterAsNull() throws FileNotFoundException {
        List<TestRow> rows = dataReader.readData(prepareFileReader("test"));
        Assertions.assertThat(rows).isNotEmpty();
        Assertions.assertThat(rows.get(0).getSecond()).isNull();
    }

    @Test
    public void readDataReadsBackslash() throws FileNotFoundException {
        List<TestRow> rows = dataReader.readData(prepareFileReader("test"));
        Assertions.assertThat(rows).isNotEmpty();
        Assertions.assertThat(rows.get(0).getFirst()).isEqualTo("test\\tvalue");
    }

    protected void hasEntryWith(Map<String, TestRow> actual, String id, String first, String second) {
        Assertions.assertThat(actual).hasEntrySatisfying(id,
                r -> {
                    Assertions.assertThat(r.getId()).isEqualTo(id);
                    Assertions.assertThat(r.getFirst()).isEqualTo(first);
                    Assertions.assertThat(r.getSecond()).isEqualTo(second);
                }
        );
    }

    @Test
    public void readDataMappedByIdReadsExpectedData() throws DuplicateRowIdException, FileNotFoundException {
        Map<String, TestRow> actual = dataReader.readDataMappedById(prepareFileReader("test"));
        Assertions.assertThat(actual).hasSize(2);
        hasEntryWith(actual, "id1", "test\\tvalue", null);
        hasEntryWith(actual, "id2", "first2", "second2");
    }

    @Test
    public void readDataMappedByIdThrowsErrorOnDuplicateKeys() {
        Assertions.assertThatThrownBy(
                () -> dataReader.readDataMappedById(prepareFileReader("duplicate-ids"))
        ).isInstanceOf(DuplicateRowIdException.class);
    }
}
