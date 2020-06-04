package com.github.piotr_rusin.language_data.language;

import com.github.piotr_rusin.language_data.Entity;

public class Language extends Entity {
    private String name;
    private String macroarea;
    private String latitude;
    private String longitude;
    private String glottocode;
    private String iso639P3code;
    private String family;
    private String subfamily;
    private String genus;
    private String isoCodes;
    private String samples100;
    private String samples200;

    public Language(LanguageRow row) {
        super(row.getId());
        this.name = row.getName();
        this.macroarea = row.getMacroarea();
        this.latitude = row.getLatitude();
        this.longitude = row.getLongitude();
        this.glottocode = row.getGlottocode();
        this.iso639P3code = row.getIso639P3code();
        this.family = row.getFamily();
        this.subfamily = row.getSubfamily();
        this.genus = row.getGenus();
        this.isoCodes = row.getIsoCodes();
        this.samples100 = row.getSamples100();
        this.samples200 = row.getSamples200();
    }

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
}
