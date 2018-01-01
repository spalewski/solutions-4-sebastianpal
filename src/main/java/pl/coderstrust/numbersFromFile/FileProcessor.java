package pl.coderstrust.numbersFromFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List<String> readFromFile(String sourceFilePath) throws IOException {
        String line = null;
        List<String> records = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFilePath))) {
            while ((line = bufferedReader.readLine()) != null) {
                records.add(line);
            }
            bufferedReader.close();
            return records;
        }

    }
    public void writeToFile(List <String> linesProcessed, String destinationFilePath) throws IOException {
        List<String> linesProccesed = linesProcessed;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFilePath));
        for (String line : linesProccesed) {
            bufferedWriter.write(line.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}


