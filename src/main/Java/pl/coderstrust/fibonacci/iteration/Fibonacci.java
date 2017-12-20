package pl.coderstrust.fibonacci.iteration;

public class Fibonacci {

    public static int fiboIte(int selectNumber) {
        // wersja iteracyjna

        int numbersInString = selectNumber+1;
        int scoreA = 0;
        int scoreB = 1;
        int scoreF = 0;

        int[] fibonacci = new int[ numbersInString ];
        fibonacci[ 0 ] = scoreA;
        fibonacci[ 1 ] = scoreB;
        for (int i = 2; i <= selectNumber; i++) {
            scoreF = scoreA + scoreB;
            scoreA = scoreB;
            scoreB = scoreF;
            fibonacci[ i ] = scoreF;
        }
        return fibonacci[ selectNumber ];
    }
}


