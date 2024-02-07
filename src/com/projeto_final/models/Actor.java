package com.projeto_final.models;

public class Actor {
    private int id;
    private String name;

    public Actor(int id, String name) {
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
