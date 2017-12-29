package pl.coderstrust.numbersFromFile;

import java.io.IOException;
import java.util.List;

public class Processor {

    public void proccesFile(String sourceFilePath, String destinationFilePath) throws IOException {
        FileProcessor fileProcessor = new FileProcessor();
        List<String> listFromFile = fileProcessor.readFromFile(sourceFilePath);
        NumberProcessor numberProcessor = new NumberProcessor();
        numberProcessor.numberProcessor(listFromFile);
        List<String> linesProcessed = numberProcessor.numberProcessor(listFromFile);
        fileProcessor.writeToFile(linesProcessed, destinationFilePath);
    }
}
