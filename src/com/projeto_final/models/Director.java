package com.projeto_final.models;

public class Director {
    private final int id;
    private final String name;

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
