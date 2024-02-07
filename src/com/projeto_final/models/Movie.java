package com.projeto_final.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Movie {
    private int id;
    private String title;
    private LocalDate releaseDate;
    private BigDecimal budget;
    private String description;
    private List<Actor> listOfActors;
    private List<Director> listOfDirectors;


    // constructor
    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public List<Director> getListOfDirectors() {
        return listOfDirectors;
    }

    public void setListOfDirectors(List<Director> listOfDirectors) {
        this.listOfDirectors = listOfDirectors;
    }

    @Override
    public String toString() {
        return String.format("%d | %s%n", this.id, this.title);
    }

}
