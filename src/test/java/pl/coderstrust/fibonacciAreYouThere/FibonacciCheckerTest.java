package pl.coderstrust.fibonacciAreYouThere;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciCheckerTest {

    @Test
    public void fibonacciChecker() {

        Assert.assertTrue(FibonacciChecker.fibonacciChecker(2));
        Assert.assertTrue(FibonacciChecker.fibonacciChecker(21));
        Assert.assertTrue(FibonacciChecker.fibonacciChecker(34));
        Assert.assertTrue(FibonacciChecker.fibonacciChecker(55));
        Assert.assertTrue(FibonacciChecker.fibonacciChecker(144));
        Assert.assertFalse(FibonacciChecker.fibonacciChecker(4));
        Assert.assertFalse(FibonacciChecker.fibonacciChecker(20));
        Assert.assertFalse(FibonacciChecker.fibonacciChecker(32));
        Assert.assertFalse(FibonacciChecker.fibonacciChecker(56));
        Assert.assertFalse(FibonacciChecker.fibonacciChecker(145));
    }
}
