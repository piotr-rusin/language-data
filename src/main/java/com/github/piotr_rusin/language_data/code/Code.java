package com.github.piotr_rusin.language_data.code;

import com.github.piotr_rusin.language_data.Entity;
import com.github.piotr_rusin.language_data.parameter.Parameter;

import java.util.Map;

public class Code extends Entity {

    private Parameter parameter;

    private String name;
    private String description;
    private String number;
    private String icon;

    public Code(CodeRow row, Map<String, Parameter> parametersById) {
        super(row.getId());
        this.name = row.getName();
        this.description = row.getDescription();
        this.number = row.getNumber();
        this.icon = row.getIcon();
        this.parameter = parametersById.get(row.getParameterId());
    }

    public Parameter getParameter() {
        return parameter;
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
}
