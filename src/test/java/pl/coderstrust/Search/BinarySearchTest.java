package pl.coderstrust.Search;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BinarySearchTest {

    int arr[] = {10, 20, 30, 40, 50};


    @Test
    public void searchNumberFound() {

        int elementIs = 20;
        Assert.assertEquals(1, BinarySearch.search(arr, elementIs));
    }

    @Test
    public void searchNumberNotFound() {
        int elementIsNot = 25;
        Assert.assertEquals(-1, BinarySearch.search(arr, elementIsNot));
    }

    @Test
    public void efficiencyTest () throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("src" + File.separator + "test" + File.separator + "resources" + File.separator + "100000.txt"));
        int [] test;
        test = new int[1000000];
        for (int i = 0; scanner.hasNextInt(); i++) {
            test[i++] = scanner.nextInt();
            BinarySearch.search(test,454);
        }
    }
}