package com.projeto_final.utils;

import com.projeto_final.models.Movie;

import java.util.List;
import java.util.Scanner;

public class MoviesUtils {
    public static int scanMovieId(Scanner scanner) {
        int id;
        do {
            System.out.print("Movie id (positive integer): ");
            id = scanner.nextInt();
            scanner.nextLine(); // remove newline
        } while (id <= 0);
        return id;
    }

    public static int searchForMovieId(int id, List<Movie> listOfMovies) {
        for (int i = 0; i < listOfMovies.size(); i++) {
            Movie movie = listOfMovies.get(i);
            if (movie.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
