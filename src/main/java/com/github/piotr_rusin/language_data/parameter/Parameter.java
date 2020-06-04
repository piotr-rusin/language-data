package com.github.piotr_rusin.language_data.parameter;

import com.github.piotr_rusin.language_data.Entity;
import com.github.piotr_rusin.language_data.contributor.Contributor;

import java.util.Map;

public class Parameter extends Entity {

    private Contributor contributor;

    private String name;
    private String description;
    private String chapter;
    private String area;

    public Parameter(ParameterRow row, Map<String, Contributor> contributorsById) {
        super(row.getId());
        this.name = row.getName();
        this.description = row.getDescription();
        this.chapter = row.getChapter();
        this.area = row.getArea();

        this.contributor = contributorsById.get(row.getContributorId());
    }

    public Contributor getContributor() {
        return contributor;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getChapter() {
        return chapter;
    }

    public String getArea() {
        return area;
    }
}
