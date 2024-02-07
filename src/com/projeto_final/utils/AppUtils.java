package com.projeto_final.utils;

import com.projeto_final.models.Movie;

import java.util.List;

public class AppUtils {
    public static void printMenu(List<Movie> listOfMovies) {
        StringBuilder builder = new StringBuilder();
        builder.append("""
                ##################
                # MOVIES CATALOG #
                ##################
                >>>>>>MOVIES<<<<<<
                ID | Title
                """);

        if (listOfMovies.isEmpty()) {
            builder.append("Empty List!\n");
        } else {
            for (Movie movie : listOfMovies) {
                builder.append(movie.toString());
            }
        }
        builder.append("""
                >>>>>MENU<<<<<
                1 - Add Movie
                2 - Delete Movie
                3 - Update Movie
                4 - Search Movie
                5 - Exit
                """);

        String toPrint = builder.toString();
        System.out.println(toPrint);
    }
}
