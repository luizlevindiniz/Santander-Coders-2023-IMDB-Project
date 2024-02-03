package com.projeto_final.app;

import com.projeto_final.controllers.MoviesController;
import com.projeto_final.models.Actor;
import com.projeto_final.models.Director;
import com.projeto_final.models.Movie;

import java.util.*;

public class App {

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
        builder.append(
                """
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

    public static void handleUserInput(List<Movie> listOfMovies, Scanner scanner) {
        int option = 0;
        while (option != 5) {
            printMenu(listOfMovies);
            try {
                option = scanner.nextInt();
                scanner.nextLine(); // remove newline
                if (option <= 0 || option > 5) {
                    System.out.println("Invalid option! Try again!");
                }

                switch (option) {
                    case 1:
                        Movie movie = MoviesController.addMovie(scanner, listOfMovies);
                        listOfMovies.add(movie);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        break;
                }

            } catch (NoSuchElementException e) {
                System.out.println("Sorry only integers are valid options!");
                scanner.nextLine(); // remove newline
            }
        }

        // returning to main
        System.out.println("Leaving...");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> listOfMovies = new ArrayList<>();
        handleUserInput(listOfMovies, scanner);
        scanner.close();
    }
}
