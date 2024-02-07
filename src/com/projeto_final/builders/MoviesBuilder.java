package com.projeto_final.builders;

import com.projeto_final.models.Actor;
import com.projeto_final.models.Director;
import com.projeto_final.models.Movie;

import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;

public class MoviesBuilder {
    private final Movie movie = new Movie();

    public Movie build() {
        return movie;
    }

    public MoviesBuilder withId(int id) {
        movie.setId(id);
        return this;
    }

    public MoviesBuilder withTitle(String title) {
        movie.setTitle(title);
        return this;
    }

    public MoviesBuilder withReleaseDate(LocalDate releaseDate) {
        movie.setReleaseDate(releaseDate);
        return this;
    }

    public MoviesBuilder withBudget(BigDecimal budget) {
        movie.setBudget(budget);
        return this;
    }

    public MoviesBuilder withDescription(String description) {
        movie.setDescription(description);
        return this;
    }

    public MoviesBuilder withActors(List<Actor> listOfActors) {
        movie.setListOfActors(listOfActors);
        return this;
    }

    public MoviesBuilder withDirectors(List<Director> listOfDirectors) {
        movie.setListOfDirectors(listOfDirectors);
        return this;
    }

}
