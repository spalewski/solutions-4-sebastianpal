package com.company;

public class Main {

// metoda rekursywna


    public static int fibonacci(int whichNumber){
        if (whichNumber < 2)
            return whichNumber;
        else
            return (fibonacci(whichNumber - 1)) + (fibonacci(whichNumber - 2));

    }

    public static void main(String[] args) {


        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(12));


    }
}
