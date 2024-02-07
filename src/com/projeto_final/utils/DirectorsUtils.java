package com.projeto_final.utils;

import com.projeto_final.models.Director;
import com.projeto_final.models.Movie;

import java.util.List;

public class DirectorsUtils {
    private static int directorId = 1;
    public static int getNextDirectorId() {
        return directorId++;
    }

    public static StringBuilder directorMenuHeader(List<Director> listOfDirectors) {
        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append("""
                >>>> Directors <<<<
                Id | Name
                """);
        if (listOfDirectors.isEmpty()) {
            menuBuilder.append("Empty!\n");
        } else {
            for (Director director : listOfDirectors) {
                menuBuilder.append(String.format("%d | %s%n", director.getId(), director.getName()));
            }
        }
        return menuBuilder;
    }
    public static void printDirectorMenu(List<Director> listOfDirectors) {
        StringBuilder menuBuilder = directorMenuHeader(listOfDirectors);
        menuBuilder.append(
                """
                        >>>> Menu <<<<
                        1 - Add Director
                        2 - Save
                        """);

        String menu = menuBuilder.toString();
        System.out.println(menu);
    }
    public static boolean searchForDirector(String name, List<Movie> listOfMovie){
        for(Movie movie : listOfMovie){
            List<Director> directors = movie.getListOfDirectors();
            for(Director director : directors){
                if(director.getName().toLowerCase().trim().equals(name)){
                    return true;
                }
            }
        }
        return false;
    }

}
