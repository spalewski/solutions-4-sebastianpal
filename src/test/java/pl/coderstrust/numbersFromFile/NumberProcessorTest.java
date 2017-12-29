package pl.coderstrust.numbersFromFile;

import org.junit.Assert;
import org.mockito.Mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NumberProcessorTest {
    NumberProcessor numberProcessor = new NumberProcessor();

    @Mock
    FileProcessor fileProcessor = mock(FileProcessor.class);


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
when(fileProcessor.readFromFile("filePath")).thenReturn(test);

Assert.assertEquals(Arrays.asList("1+5+65+9999=10070", "3+4+33+656=696", "44+5+433=482", "17+4=21"), numberProcessor.numberProcessor(test));
    }
}