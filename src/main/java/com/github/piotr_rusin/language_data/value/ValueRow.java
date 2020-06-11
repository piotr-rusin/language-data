package com.github.piotr_rusin.language_data.value;

import com.github.piotr_rusin.language_data.DataRow;
import com.github.piotr_rusin.language_data.code.CodeRow;
import com.github.piotr_rusin.language_data.example.ExampleRow;
import com.github.piotr_rusin.language_data.language.LanguageRow;
import com.github.piotr_rusin.language_data.parameter.ParameterRow;
import com.opencsv.bean.CsvBindByName;

public class ValueRow extends DataRow {

    @CsvBindByName(column="Language_ID")
    private String languageId;
    private LanguageRow languageData;

    @CsvBindByName(column="Parameter_ID")
    private String parameterId;
    private ParameterRow parameterData;

    @CsvBindByName(column="Example_ID")
    private String exampleId;
    private ExampleRow exampleData;

    @CsvBindByName(column="Code_ID")
    private String codeId;
    private CodeRow codeData;

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

    public LanguageRow getLanguageData() {
        return languageData;
    }

    public ParameterRow getParameterData() {
        return parameterData;
    }

    public ExampleRow getExampleData() {
        return exampleData;
    }

    public CodeRow getCodeData() {
        return codeData;
    }
}
