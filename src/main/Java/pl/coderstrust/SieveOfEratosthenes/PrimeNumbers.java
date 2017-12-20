package pl.coderstrust.SieveOfEratosthenes;

public class PrimeNumbers {

    public static int[] primeNumbers(int primes) {

        int tabRange = 20;
        int[] returnNumbers = new int[ tabRange ];
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
                returnNumbers[ i ] = i;

            }
        }
        return returnNumbers;
    }

}