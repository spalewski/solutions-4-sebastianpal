package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Sebastian ", 500);

        System.out.println("Sebastian " + newScore);
calculateScore(500);
calculateScore();
    }


    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player: " + playerName + " scored: " + score + " points") ;
        return score * 1000;
    }
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored: " + score + " points") ;
        return score * 1000;
    }
    public static int calculateScore()
    {
        System.out.println("Unnamed player scored 0 ") ;
        return 0;
    }
}
