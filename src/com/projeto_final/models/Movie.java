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

    // constructor
    public Movie(int id, String title, LocalDate releaseDate, BigDecimal budget, String description,
                 List<Actor> listOfActors, List<Director> listOfDirectors) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.budget = budget;
        this.description = description;
        this.listOfActors = listOfActors;
        this.listOfDirectors = listOfDirectors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
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
