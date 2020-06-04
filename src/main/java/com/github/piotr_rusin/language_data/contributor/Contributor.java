package com.github.piotr_rusin.language_data.contributor;

import com.github.piotr_rusin.language_data.Entity;

public class Contributor extends Entity {
    private String name;

    public Contributor(ContributorRow row) {
        super(row.getId());
        this.name = row.getName();
    }

    public String getName() {
        return name;
    }
}
