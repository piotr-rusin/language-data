package com.github.piotr_rusin.language_data;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.RFC4180Parser;
import com.opencsv.RFC4180ParserBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;

import java.io.Reader;
import java.util.List;

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
}
