package com.projeto_final.controllers;

import com.projeto_final.builders.MoviesBuilder;
import com.projeto_final.models.Actor;
import com.projeto_final.models.Director;
import com.projeto_final.models.Movie;
import com.projeto_final.repositories.MoviesRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import static com.projeto_final.handlers.MoviesHandlers.handleMovieIdInput;
import static com.projeto_final.handlers.MoviesHandlers.handleActorsInput;
import static com.projeto_final.handlers.MoviesHandlers.handleDirectorsInput;

public class MoviesController implements MoviesRepository {
    @Override
    public Movie addMovie(Scanner scanner, List<Movie> listOfMovies) {

        // Scanning id
        int id = handleMovieIdInput(scanner, listOfMovies);

        // Scanning other attributes
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Release Date [yyyy-mm-dd]: ");
        String rawReleaseDate = scanner.nextLine().trim();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate releaseDate = LocalDate.parse(rawReleaseDate, dateFormat);

        System.out.print("Budget: ");
        String stringBudget = scanner.nextLine();
        BigDecimal budget = new BigDecimal(stringBudget);
        // remove newline

        System.out.print("Description: ");
        String description = scanner.nextLine();

        // Scanning actors and directors
        List<Actor> actorsList = handleActorsInput(scanner);
        List<Director> directorList = handleDirectorsInput(scanner);

        return new MoviesBuilder().withId(id).withTitle(title).withReleaseDate(releaseDate)
                .withBudget(budget).withDescription(description).withActors(actorsList)
                .withDirectors(directorList).build();
    }

    @Override
    public void deleteMovie(int id, List<Movie> listOfMovies) {

    }

    @Override
    public void editMovie(Scanner scanner, List<Movie> listOfMovies) {

    }

    @Override
    public List<Movie> searchMovie(String title, List<Movie> listOfMovies) {
        return null;
    }
}
