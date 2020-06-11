package com.github.piotr_rusin.language_data.code;

import com.github.piotr_rusin.language_data.DataRow;
import com.github.piotr_rusin.language_data.parameter.ParameterRow;
import com.opencsv.bean.CsvBindByName;

public class CodeRow extends DataRow {

    @CsvBindByName(column="Parameter_ID")
    private String parameterId;
    private ParameterRow parameterData;

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

    public ParameterRow getParameterData() {
        return parameterData;
    }
}
