package com.company;

public class Main {

    public static void main(String[] args) {
        int foundNumbers = 0;
        int number = 5;
        int finishNumber = 20;
        while (foundNumbers < 6) {
            if (!isEvenNumber(number)) {
                number++;

            } else {
                System.out.println("Parzysta liczba: " + number);
                number++;
                ++foundNumbers;
            }

        }
        System.out.println("Liczba znaliezionych liczb parzystych: " + foundNumbers);
    }

public static boolean isEvenNumber(int number){

        if ((number%2)==0){
            return true;
        }
        else {
            return false;
           }
        }
        }

