package com.company;

import java.util.ArrayList;
import java.util.List;

public class Controler {



    List<Game> games = new ArrayList<>();



    public void addGame(Game g){

        games.add(g);

    }

    public void showGame(){

        for(Game aGame : games){
            System.out.print("DEVELOPER " + aGame.getStudio());
            System.out.print(" TYTUŁ: " + aGame.getTitle());
            System.out.println(" OCENA: " + aGame.getScore());
        }
    }

    public void searchDeveloper(String title){

        for(Game aGame : games){
            if(title.equals(aGame.getStudio())) {
                System.out.print("DEVELOPER " + aGame.getStudio());
                System.out.print(" TYTUŁ: " + aGame.getTitle());
                System.out.println(" OCENA: " + aGame.getScore());
            }
        }
    }


    public void searchGame(String title){

        for(Game aGame : games){
            if(title.equals(aGame.getTitle())) {
                System.out.print("DEVELOPER " + aGame.getStudio());
                System.out.print(" TYTUŁ: " + aGame.getTitle());
                System.out.println(" OCENA: " + aGame.getScore());
            }
        }
    }

}
