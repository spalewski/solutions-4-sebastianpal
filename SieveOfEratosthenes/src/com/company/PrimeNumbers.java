package com.company;

public class PrimeNumbers {

    public static void primeNumbers(int tabRange) {


        boolean[] primeNumbers = new boolean[ tabRange ];
        primeNumbers[ 0 ] = false;
        primeNumbers[ 1 ] = false;
        for (int i = 2; i < tabRange; i++) {
            primeNumbers[ i ] = true;
        }
        for (int i = 2; i * i < tabRange; i++) {
            for (int j = (i * i); j < tabRange; j = j + i) {
                primeNumbers[ j ] = false;
            }
        }
        for (int i = 0; i < tabRange; i++) {
            if (primeNumbers[ i ]) {
                System.out.println("Number " + i + " is prime number");
            }
        }
    }

}
