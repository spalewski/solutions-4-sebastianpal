package pl.coderstrust.numbersFromFile;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String sourceFilePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000.txt";
        String destinationFilePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000_processed.txt";

        Processor processor = new Processor();
        processor.proccesFile(sourceFilePath, destinationFilePath);
    }
}
