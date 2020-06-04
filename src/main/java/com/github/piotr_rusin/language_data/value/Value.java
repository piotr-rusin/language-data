package com.github.piotr_rusin.language_data.value;

import com.github.piotr_rusin.language_data.Entity;
import com.github.piotr_rusin.language_data.code.Code;
import com.github.piotr_rusin.language_data.example.Example;
import com.github.piotr_rusin.language_data.language.Language;
import com.github.piotr_rusin.language_data.parameter.Parameter;

import java.util.Map;

public class Value extends Entity {

    private Language language;
    private Parameter parameter;
    private Example example;
    private Code code;
    private String value;
    private String comment;
    private String source;

    public Value(
            ValueRow row,
            Map<String, Language> languagesById,
            Map<String, Parameter> parametersById,
            Map<String, Example> examplesById,
            Map<String, Code> codesById
    ) {
        super(row.getId());

        this.value = row.getValue();
        this.comment = row.getComment();
        this.source = row.getSource();

        this.language = languagesById.get(row.getLanguageId());
        this.parameter = parametersById.get(row.getParameterId());
        this.example = examplesById.get(row.getExampleId());
        this.code = codesById.get(row.getCodeId());
    }

    public Language getLanguage() {
        return language;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public Example getExample() {
        return example;
    }

    public Code getCode() {
        return code;
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
