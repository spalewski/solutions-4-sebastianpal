package pl.coderstrust.numbersFromFile;

// responsible for transforming list of numbers to sum of numbers and its result

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberProcessor {
    String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000.txt";

    public void numberProcessor() throws IOException {
    int sum=0;
    int score = 0;
        FileProcessor fileProcessor = new FileProcessor();
        Scanner scanner = new Scanner(fileProcessor.fileReader(filePath).toString());
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println("Found :" + scanner.nextInt());
            }
            scanner.next();
        }
        scanner.close();
    }
}