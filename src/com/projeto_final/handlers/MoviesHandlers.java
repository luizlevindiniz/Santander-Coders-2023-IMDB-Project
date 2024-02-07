package com.projeto_final.handlers;

import com.projeto_final.models.Actor;
import com.projeto_final.models.Director;
import com.projeto_final.models.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.projeto_final.utils.MoviesUtils.scanMovieId;
import static com.projeto_final.utils.MoviesUtils.searchForMovieId;
import static com.projeto_final.utils.ActorsUtils.printActorMenu;
import static com.projeto_final.utils.ActorsUtils.getNextActorId;
import static com.projeto_final.utils.DirectorsUtils.printDirectorMenu;
import static com.projeto_final.utils.DirectorsUtils.getNextDirectorId;

public class MoviesHandlers {

    public static int handleMovieIdInput(Scanner scanner, List<Movie> listOfMovies) {
        boolean isIdValid = false;
        int id = scanMovieId(scanner);

        while (!isIdValid) {
            if (searchForMovieId(id, listOfMovies) != -1) {
                System.out.println("ID in use! Try again!");
                id = scanMovieId(scanner);
            } else {
                isIdValid = true;
            }
        }

        return id;
    }

    public static List<Actor> handleActorsInput(Scanner scanner) {
        int option;
        List<Actor> actorsList = new ArrayList<>();

        boolean validActors = false;
        while (!validActors) {
            printActorMenu(actorsList);
            option = scanner.nextInt();
            scanner.nextLine(); // remove newline

            if (option <= 0 || option > 2) {
                System.out.println("Invalid Option!");
            } else if (option == 2 && actorsList.isEmpty()) {
                System.out.println("Add at least one actor!");
            } else if (option == 2) {
                validActors = true;
            } else {
                System.out.print("Artist Name: ");
                String name = scanner.nextLine();

                Actor actor = new Actor(getNextActorId(), name);
                actorsList.add(actor);
            }
        }

        return actorsList;
    }

    public static List<Director> handleDirectorsInput(Scanner scanner) {
        int option;
        List<Director> directorList = new ArrayList<>();

        boolean validDirectors = false;
        while (!validDirectors) {
            printDirectorMenu(directorList);
            option = scanner.nextInt();
            scanner.nextLine(); // remove newline

            if (option <= 0 || option > 2) {
                System.out.println("Invalid Option!");
            } else if (option == 2 && directorList.isEmpty()) {
                System.out.println("Add at least one director!");
            } else if (option == 2) {
                validDirectors = true;
            } else {
                System.out.print("Director's Name: ");
                String name = scanner.nextLine();

                Director director = new Director(getNextDirectorId(), name);
                directorList.add(director);
            }
        }
        return directorList;
    }
}
