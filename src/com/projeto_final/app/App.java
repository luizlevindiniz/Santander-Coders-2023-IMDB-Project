package com.projeto_final.app;

import com.projeto_final.models.Movie;

import java.util.*;

import static com.projeto_final.handlers.AppHandlers.handleUserInput;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> listOfMovies = new ArrayList<>();
        handleUserInput(listOfMovies, scanner);
        scanner.close();
    }
}
