package pl.coderstrust.BinarySearch;

import org.junit.Assert;
import org.junit.Test;

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
}