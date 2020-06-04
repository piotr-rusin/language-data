package com.github.piotr_rusin.language_data.value;

import com.github.piotr_rusin.language_data.DataRow;
import com.opencsv.bean.CsvBindByName;

public class ValueRow extends DataRow {

    @CsvBindByName(column="Language_ID")
    private String languageId;
    @CsvBindByName(column="Parameter_ID")
    private String parameterId;
    @CsvBindByName(column="Example_ID")
    private String exampleId;
    @CsvBindByName(column="Code_ID")
    private String codeId;
    @CsvBindByName(column="Value")
    private String value;
    @CsvBindByName(column="Comment")
    private String comment;
    @CsvBindByName(column="Source")
    private String source;

    public String getLanguageId() {
        return languageId;
    }

    public String getParameterId() {
        return parameterId;
    }

    public String getExampleId() {
        return exampleId;
    }

    public String getCodeId() {
        return codeId;
    }

    public String getValue() {
        return value;
    }

    public String getComment() {
        return comment;
    }

    public String getSource() {
        return source;
    }
}
