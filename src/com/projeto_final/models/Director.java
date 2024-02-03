package com.projeto_final.models;

public class Director {
    private int id;
    private String name;
    private long age;
    private String nationality;
    private long yearsAsDirector;

    public Director(int id, String name, long age, String nationality, long yearsAsDirector) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.yearsAsDirector = yearsAsDirector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public long getYearsAsDirector() {
        return yearsAsDirector;
    }

    public void setYearsAsDirector(long yearsAsDirector) {
        this.yearsAsDirector = yearsAsDirector;
    }
}
