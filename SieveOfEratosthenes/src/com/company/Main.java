package com.company;

public class Main {

    public static void main(String[] args) {

        int tabRange = 100;
        boolean[] primeNumbers = new boolean[ tabRange ];
        primeNumbers[ 0 ] = false;
        primeNumbers[ 1 ] = false;
        // create array primeNumbers and set all values to true
        for (int i = 2; i < tabRange; i++) {
            primeNumbers[ i ] = true;
        }
        //  chcek values with Sieve of Eratosthenes

        for (int i = 2; i * i < tabRange; i++) {
           // if (primeNumbers[ i ]) ;
            // {
                for (int j = (i * i);  j < tabRange; j = j + i) {
                    primeNumbers[ j ] = false;
                }
            //}
        }
        // using loop print all prime numbers
        for (int i = 0; i < tabRange; i++) {
            if (primeNumbers[ i ]) {
                System.out.println("Number " + i + " is prime number");
            }
        }
    }
}