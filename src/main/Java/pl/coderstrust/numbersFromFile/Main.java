package pl.coderstrust.numbersFromFile;

import java.io.File;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000.txt";

//FileProcessor fileProcessor = new FileProcessor();
//System.out.println(fileProcessor.fileReader(filePath));
NumberProcessor numberProcessor = new NumberProcessor();
numberProcessor.numberProcessor();

//System.out.println(fileProcessor.fileReader(filePath).size());

    }
}
