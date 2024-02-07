package com.projeto_final.utils;

import com.projeto_final.models.Actor;
import com.projeto_final.models.Movie;

import java.util.List;

public class ActorsUtils {
    private static int actorId = 1;
    public static int getNextActorId() {
        return actorId++;
    }

    public static StringBuilder actorMenuHeader(List<Actor> listOfActors) {
        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append("""
                >>>> Actors <<<<
                Id | Name
                """);
        if (listOfActors.isEmpty()) {
            menuBuilder.append("Empty!\n");
        } else {
            for (Actor actor : listOfActors) {
                menuBuilder.append(String.format("%d | %s%n", actor.getId(), actor.getName()));
            }
        }
        return menuBuilder;
    }
    public static void printActorMenu(List<Actor> listOfActors) {
        StringBuilder menuBuilder = actorMenuHeader(listOfActors);
        menuBuilder.append(
                """
                        >>>> Menu <<<<
                        1 - Add Actor
                        2 - Save
                        """);

        String menu = menuBuilder.toString();
        System.out.println(menu);
    }
    public static boolean searchForActor(String name, List<Movie> listOfMovie){
        for(Movie movie : listOfMovie){
            List<Actor> actors = movie.getListOfActors();
            for(Actor actor : actors){
                if(actor.getName().toLowerCase().trim().equals(name)){
                    return true;
                }
            }
        }
        return false;
    }

}
