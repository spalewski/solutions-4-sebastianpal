package pl.coderstrust.numbersFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
    String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000.txt";

    public List<String> fileReader(String filePath) throws IOException {

        String line = null;
        List<String> records = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            while ((line = bufferedReader.readLine()) != null) {
                records.add(line);
            }
            bufferedReader.close();
            return records;
        }
    }
}