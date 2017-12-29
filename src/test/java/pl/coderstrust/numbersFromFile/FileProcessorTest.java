package pl.coderstrust.numbersFromFile;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileProcessorTest {
    String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000.txt";
    String testFilePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "content_test.txt";
    FileProcessor fileProcessor = new FileProcessor();

    @Test
    public void checkNumberOfLines() throws IOException {

        int linesManualCheck = 105;
        int linesFromMethod = fileProcessor.readFromFile(filePath).size();
        Assert.assertEquals(linesManualCheck, linesFromMethod);
    }

    @Test
    public void readLinesFromFile() throws IOException {

        List<String> testList = fileProcessor.readFromFile(testFilePath);

        String numS0 = "1";
        String numS1 = "3";
        String numS2 = "5";
        String numS3 = "17";

        Assert.assertEquals(numS0, testList.get(0));
        Assert.assertEquals(numS1, testList.get(1));
        Assert.assertEquals(numS2, testList.get(2));
        Assert.assertEquals(numS3, testList.get(3));

    }
}