package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Main main = new Main();
    main.task();


    }

    public String getString(){
        String name;
        Scanner read = new Scanner(System.in);
        name = read.nextLine();

        return name;
    }


    public int getInt(){

        int number;
        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        return number;
    }
    public void task(){

        System.out.print("wyjdz, dodaj, wyswietl, wyszukaj: ");
        String choose = getString();
        Controler controler = new Controler();
        while(!choose.equals("wyjdz")){

            if(choose.equals("dodaj")){
                System.out.print("Podaj Developera: ");
                String developer = getString();
                System.out.print("Podaj nazwę gry: ");
                String title = getString();
                System.out.print("Daj ocene od 1 do 10: ");
                int score = getInt();
                    if(score<=10 && score>=1){
                    controler.addGame(new Game(developer,title,score));
                     }
                    else {
                    System.out.println("Źle wprowadzona ocena!!");
                     }
            }
            else if(choose.equals( "wyswietl")){
                controler.showGame();
            }
            else if(choose.equals("wyszukaj")){
                System.out.print("studio, gra: ");
                String developer = getString();
                System.out.print("Podaj nazwe: ");
                String title = getString();
                    if(developer.equals("studio")){
                        controler.searchDeveloper(title);
                    }
                    else if(developer.equals("gra")){
                        controler.searchGame(title);
                    }
                    else {
                        System.out.println("Brak elementów w bazie");
                    }
            }
            else {
                System.out.println("Zła liczba");
                System.out.println(choose);
            }

            System.out.print("wyjdz, dodaj, wyswietl, wyszukaj: ");
            choose=getString();
        }

    }



}
