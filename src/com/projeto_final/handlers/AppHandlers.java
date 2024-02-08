package com.projeto_final.handlers;

import com.projeto_final.controllers.MoviesController;
import com.projeto_final.models.Movie;

import java.time.DateTimeException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static com.projeto_final.utils.AppUtils.printMenu;

public class AppHandlers {
    public static void handleUserInput(List<Movie> listOfMovies, Scanner scanner) {
        int option = 0;
        MoviesController moviesController = new MoviesController();
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
                        Movie movie = moviesController.addMovie(scanner, listOfMovies);
                        listOfMovies.add(movie);
                        break;
                    case 2:
                        System.out.print("Insert movie id to delete: ");
                        int deletionId = scanner.nextInt();
                        scanner.nextLine(); // remove newline
                        moviesController.deleteMovie(deletionId,listOfMovies);
                        break;
                    case 3:
                        System.out.print("Insert movie id to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // remove newline
                        moviesController.editMovie(updateId,scanner,listOfMovies);
                        break;
                    case 4:
                        System.out.print("Title to search for: ");
                        String titleToSearch = scanner.nextLine();
                        System.out.println(moviesController.searchMovie(titleToSearch,listOfMovies));
                        break;
                    default:
                        break;
                }

            } catch (NoSuchElementException e) {
                System.out.println("Sorry, invalid input!");
                scanner.nextLine(); // remove newline
            } catch (DateTimeException e) {
                System.out.println("Sorry, invalid release date format!");
            } catch (NumberFormatException e) {
                System.out.println("Sorry, invalid budget format!");
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }

        // returning to main
        System.out.println("Leaving...");

    }
}
