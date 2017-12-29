package pl.coderstrust.Search;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LinearSearchTest {

    int arr[] = {10, 20, 30, 40, 50};

    @Test
    public void searchNumberFound() {

        int elementIs = 20;
        Assert.assertEquals(1, LinearSearch.search(arr, elementIs));
    }

    @Test
    public void searchNumberNotFound() {
        int elementIsNot = 25;
        Assert.assertEquals(-1, LinearSearch.search(arr, elementIsNot));
    }

    @Test
    public void efficiencyTest() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src" + File.separator + "test" + File.separator + "resources" + File.separator + "100000.txt"));
        int[] test = new int[ 1000000 ];
        long startTime = System.currentTimeMillis();
        for (int i = 0; scanner.hasNextInt(); i++) {
            test[ i++ ] = scanner.nextInt();
            LinearSearch.search(test, 454);
            long endTime = System.currentTimeMillis();
            System.out.println("LinearSearch took " + (endTime - startTime) + " milliseconds");
        }
    }
}