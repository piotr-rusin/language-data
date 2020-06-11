package com.github.piotr_rusin.language_data.language;

import com.github.piotr_rusin.language_data.DataRow;
import com.github.piotr_rusin.language_data.DuplicateRowIdException;
import com.opencsv.bean.CsvBindByName;

import java.io.FileNotFoundException;
import java.util.Map;

public class LanguageRow extends DataRow {

    @CsvBindByName(column="Name")
    private String name;
    @CsvBindByName(column="Macroarea")
    private String macroarea;
    @CsvBindByName(column="Latitude")
    private String latitude;
    @CsvBindByName(column="Longitude")
    private String longitude;
    @CsvBindByName(column="Glottocode")
    private String glottocode;
    @CsvBindByName(column="ISO639P3code")
    private String iso639P3code;
    @CsvBindByName(column="Family")
    private String family;
    @CsvBindByName(column="Subfamily")
    private String subfamily;
    @CsvBindByName(column="Genus")
    private String genus;
    @CsvBindByName(column="ISO_codes")
    private String isoCodes;
    @CsvBindByName(column="Samples_100")
    private String samples100;
    @CsvBindByName(column="Samples_200")
    private String samples200;

    public String getName() {
        return name;
    }

    public String getMacroarea() {
        return macroarea;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getGlottocode() {
        return glottocode;
    }

    public String getIso639P3code() {
        return iso639P3code;
    }

    public String getFamily() {
        return family;
    }

    public String getSubfamily() {
        return subfamily;
    }

    public String getGenus() {
        return genus;
    }

    public String getIsoCodes() {
        return isoCodes;
    }

    public String getSamples100() {
        return samples100;
    }

    public String getSamples200() {
        return samples200;
    }

    public static Map<String, LanguageRow> readAllFromFile(String path) throws FileNotFoundException, DuplicateRowIdException {
        return readAllFromFile(path, LanguageRow.class);
    }
}
