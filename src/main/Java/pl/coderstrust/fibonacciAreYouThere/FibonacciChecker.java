package pl.coderstrust.fibonacciAreYouThere;

import java.util.HashSet;

public class FibonacciChecker {

    public static boolean fibonacciChecker(int numberToCheck) {

        boolean isFibonacci;

    HashSet<Integer> fibonacci = new HashSet();

        int numbersInString = numberToCheck + 1;
        int scoreA = 0;
        int scoreB = 1;
        int scoreF = 0;

        int[] fibonacciAr = new int[ numbersInString ];
        fibonacciAr[ 0 ] = scoreA;
        fibonacciAr[ 1 ] = scoreB;
        for (int i = 2; i <= numberToCheck; i++) {
            scoreF = scoreA + scoreB;
            scoreA = scoreB;
            scoreB = scoreF;
            fibonacciAr[ i ] = scoreF;
        }
        for (int i = 0; i <fibonacciAr.length; i++) {
            fibonacci.add(fibonacciAr[i]);
        }

        if (fibonacci.contains(numberToCheck)){
            isFibonacci = true;
        } else isFibonacci = false ;

        return isFibonacci;
    }
}


