package com.projeto_final.controllers;

import com.projeto_final.builders.MoviesBuilder;
import com.projeto_final.models.Actor;
import com.projeto_final.models.Director;
import com.projeto_final.models.Movie;
import com.projeto_final.repositories.MoviesRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.projeto_final.handlers.MoviesHandlers.*;

public class MoviesController implements MoviesRepository {
    @Override
    public Movie addMovie(Scanner scanner, List<Movie> listOfMovies) {

        // Scanning id
        int id = handleMovieIdInput(scanner, listOfMovies);

        // Scanning other attributes
        String title = handleMovieTitleInput(scanner);

        LocalDate releaseDate = handleMovieReleaseDateInput(scanner);

        BigDecimal budget = handleMovieBudgetInput(scanner);

        String description = handleMovieDescriptionInput(scanner);

        // Scanning actors and directors
        List<Actor> actorsList = handleActorsInput(scanner);
        List<Director> directorList = handleDirectorsInput(scanner);

        return new MoviesBuilder().withId(id).withTitle(title).withReleaseDate(releaseDate)
                .withBudget(budget).withDescription(description).withActors(actorsList)
                .withDirectors(directorList).build();
    }

    @Override
    public void deleteMovie(int id, List<Movie> listOfMovies) {
        Optional<Movie> movieToDelete = listOfMovies.stream().filter(movie -> movie.getId() == id).findFirst();
        if(movieToDelete.isPresent()){
            listOfMovies.remove(movieToDelete.get());
        }
        else {
            throw new RuntimeException("Movie not found!");
        }
    }

    @Override
    public void editMovie(int id ,Scanner scanner, List<Movie> listOfMovies) {
        OptionalInt movieToEditIndex = IntStream.range(0,listOfMovies.size())
                .filter(movieIndex -> id == listOfMovies.get(movieIndex).getId()).findFirst();

        if(movieToEditIndex.isPresent()){
            System.out.println("Editing movie " + listOfMovies.get(movieToEditIndex.getAsInt()).getTitle() + "...");
        }
        else {
            throw new RuntimeException("Movie not found!");
        }

        // Scanning other attributes
        String newTitle = handleMovieTitleInput(scanner);

        LocalDate newReleaseDate = handleMovieReleaseDateInput(scanner);

        BigDecimal newBudget = handleMovieBudgetInput(scanner);

        String newDescription = handleMovieDescriptionInput(scanner);

        // Scanning actors and directors
        List<Actor> newActorsList = handleActorsInput(scanner);
        List<Director> newDirectorList = handleDirectorsInput(scanner);

        Movie updatedMovie = new MoviesBuilder().withId(id).withTitle(newTitle).withReleaseDate(newReleaseDate)
                .withBudget(newBudget).withDescription(newDescription).withActors(newActorsList)
                .withDirectors(newDirectorList).build();

        listOfMovies.set(movieToEditIndex.getAsInt(),updatedMovie);
    }

    @Override
    public List<Movie> searchMovie(String title, List<Movie> listOfMovies) {
        Stream<Movie> filteredMovieList = listOfMovies.stream().filter(movie -> movie.getTitle().toLowerCase()
                .contains(title.toLowerCase()));
        return filteredMovieList.collect(Collectors.toList());
    }
}
