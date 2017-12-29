package pl.coderstrust.fibonacciAreYouThere;

import java.util.HashSet;

public class FibonacciChecker {

    public static boolean fibonacciChecker(long numberToCheck) {

        boolean isFibonacci;

    HashSet<Long> fibonacci = new HashSet();

        long numbersInString = numberToCheck;
        long scoreA = 0;
        long scoreB = 1;
        long scoreF = 0;
        fibonacci.add((long) 0);
        fibonacci.add((long) 1);

        for (long i = 2; i <=numbersInString; i++) {
        scoreF = scoreA + scoreB;
        scoreA = scoreB;
        scoreB = scoreF;
        fibonacci.add(scoreF);
        }
        if (fibonacci.contains(numberToCheck)){
            isFibonacci = true;
        } else isFibonacci = false ;

        return isFibonacci;
    }
}


