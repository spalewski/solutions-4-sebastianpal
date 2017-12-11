package com.company;

public class Main {

    public static void main(String[] args) {

        // wersja iteracyjna

        int numbersInString = 20;
        int count = 0;
        int scoreA = 0;
        int scoreB = 1;
        int scoreF = 0;

        int[] fibonacci = new int[numbersInString];
        fibonacci[0] = scoreA;
        fibonacci[1] = scoreB;
        for (int i = 2; i < fibonacci.length; i++) {
            scoreF = scoreA+scoreB;
            scoreA = scoreB;
            scoreB  = scoreF;
            fibonacci[i] = scoreF;
        }

        System.out.println("Liczba Fibonacciego nr: 5 to: " + fibonacci[5]);
        System.out.println("Liczba Fibonacciego nr: 10 to: " + fibonacci[10]);
        System.out.println("Liczba Fibonacciego nr: 15 to: " + fibonacci[15]);


        // wypisanie całego ciągu
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println("Liczba Fibonacciego nr: " + count + " to: " + fibonacci[i]);
            count++;



        }

    }
}
