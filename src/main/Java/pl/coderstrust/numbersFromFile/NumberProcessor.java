package pl.coderstrust.numbersFromFile;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NumberProcessor {

    public List<String> numberProcessor(String sourceFilePath) throws IOException {

        int sum = 0;
        int score = 0;
        FileProcessor fileProcessor = new FileProcessor();
        List<String> listFromFile = fileProcessor.fileReader(sourceFilePath);
        List<String> linesFiltered = new ArrayList<String>();
        for (String line : listFromFile) {
            if (!line.isEmpty() && line.matches("[0-9\\s]*")) {
                linesFiltered.add(line);
            }
        }
        List<String> linesProcessed = new ArrayList<>();
        int l = linesFiltered.size();
        for (int i = 0; i < l; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(linesFiltered.get(i));
            StringBuilder line = new StringBuilder();
            while (stringTokenizer.hasMoreTokens()) {
                int c = Integer.valueOf(stringTokenizer.nextToken());
                sum += c;
                line.append(c);
                line.append("+");
            }
            line.deleteCharAt(line.length() - 1);
            line.append("=");
            line.append(sum);
            linesProcessed.add(line.toString());
        }
        return linesProcessed;
    }
}