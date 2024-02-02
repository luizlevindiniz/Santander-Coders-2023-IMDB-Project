package com.projeto_final.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String name;
    private LocalDate releaseDate;
    private BigDecimal budget;
    private String description;
    private List<Actor> listOfActors;
    private List<Director> listOfDirectors;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
