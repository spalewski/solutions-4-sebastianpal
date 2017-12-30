package pl.coderstrust.Search;

import org.junit.Assert;
import org.junit.Test;
import pl.coderstrust.Search.BinarySearch;

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
}