package com.github.piotr_rusin.language_data;

public abstract class Entity {
    private String id;

    public Entity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
