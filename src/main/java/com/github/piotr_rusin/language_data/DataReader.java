package com.github.piotr_rusin.language_data;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.RFC4180Parser;
import com.opencsv.RFC4180ParserBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataReader {
    public static <T extends DataRow> List<T> readData(Reader reader, Class<T> rowClass) {
        RFC4180Parser rfc4180Parser = new RFC4180ParserBuilder()
                .withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS)
                .build();

        CSVReader csvReader = new CSVReaderBuilder(reader)
                .withCSVParser(rfc4180Parser)
                .build();
        CsvToBean<T> csvToBean = new CsvToBeanBuilder<T>(csvReader)
                .withType(rowClass)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        return csvToBean.parse();
    }

    public static <T extends DataRow> Map<String, T> readDataMappedById(Reader reader, Class<T> rowClass) throws DuplicateRowIdException {
        Map<String, T> map = new HashMap<>();
        for (T row : DataReader.readData(reader, rowClass)) {
            if (map.containsKey(row.getId())) {
                throw new DuplicateRowIdException(String.format("Duplicate ID value detected for %s and %s", map.get(row.id), row));
            }
            map.put(row.getId(), row);
        }

        return map;
    }
}
