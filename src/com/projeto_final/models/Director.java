package com.projeto_final.models;

public class Director {
    private String name;
    private long age;
    private String nationality;
    private long yearsAsDirector;

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
