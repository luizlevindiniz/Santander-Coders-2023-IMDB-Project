package com.projeto_final.repositories;

import com.projeto_final.models.Movie;

import java.util.List;
import java.util.Scanner;

public interface MoviesRepository {
    Movie addMovie(Scanner scanner, List<Movie> listOfMovies);

    void deleteMovie(int id, List<Movie> listOfMovies);

    void editMovie(int id, Scanner scanner, List<Movie> listOfMovies);

    List<Movie> searchMovie(String title, List<Movie> listOfMovies);

}
