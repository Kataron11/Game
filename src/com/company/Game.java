package com.company;

public class Game {


    private String studio;
    private String title;
    private int score;

    public Game(String studio, String title, int score) {
        this.studio = studio;
        this.title = title;
        this.score = score;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
