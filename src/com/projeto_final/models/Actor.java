package com.projeto_final.models;

public class Actor {
    private String name;
    private long age;
    private String nationality;
    private long yearsActing;

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

    public long getYearsActing() {
        return yearsActing;
    }

    public void setYearsActing(long yearsActing) {
        this.yearsActing = yearsActing;
    }
}
