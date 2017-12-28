package pl.coderstrust.numbersFromFile;

import java.io.IOException;

public class Processor {

    public void proccesFile(String sourceFilePath, String destinationFilePath) throws IOException {
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.fileReader(sourceFilePath);
        NumberProcessor numberProcessor = new NumberProcessor();
        numberProcessor.numberProcessor(sourceFilePath);
        fileProcessor.fileWriter(sourceFilePath, destinationFilePath);
    }
}
