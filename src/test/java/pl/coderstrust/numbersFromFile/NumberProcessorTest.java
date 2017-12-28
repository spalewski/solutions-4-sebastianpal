package pl.coderstrust.numbersFromFile;

import java.io.File;
import java.io.IOException;


public class NumberProcessorTest {
    NumberProcessor numberProcessor = new NumberProcessor();
    String testFilePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "numbers_test.txt";

    @org.junit.Test
    public void proccesData() throws IOException {

    //    Assert.assertEquals(Arrays.asList("1+5+65+9999=10070", "3+4+33+656=696", "44+5+433=482", "17+4=21"), numberProcessor.numberProcessor(testFilePath));

    }
}