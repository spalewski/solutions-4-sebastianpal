package pl.coderstrust.numbersFromFile;

import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberProcessorTest {
    NumberProcessor numberProcessor = new NumberProcessor();

    @org.junit.Test
    public void proccesData() throws IOException {
        List<String> test = new ArrayList<String>();
        test.add("Abcd\n");
        test.add("Abcd\n");
        test.add("!@#$\n");
        test.add("1 5 65 9999\n");
        test.add("3 4 33 656\n");
        test.add("44 5 433\n");
        test.add("abcd\n");
        test.add("!@#$\n");
        test.add("17 4");

        Assert.assertEquals(Arrays.asList("1+5+65+9999=10070", "3+4+33+656=696", "44+5+433=482", "17+4=21"), numberProcessor.numberProcessor(test));

    }
}