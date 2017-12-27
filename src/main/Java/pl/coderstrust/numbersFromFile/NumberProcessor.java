package pl.coderstrust.numbersFromFile;

// responsible for transforming list of numbers to sum of numbers and its result

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberProcessor {
    String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000.txt";

    public List<String> numberProcessor() throws IOException {

        int sum = 0;
        int score = 0;

        int[] ints;
        FileProcessor fileProcessor = new FileProcessor();
        List<String> listFromFile = fileProcessor.fileReader(filePath);
        Scanner scanner = new Scanner(listFromFile.toString());
        List<String> linesFiltered = new ArrayList<String>();
        Scanner sc = new Scanner(linesFiltered.toString());
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    linesFiltered.add(scanner.nextLine());
                }
               else scanner.next();
            }

            List<String> linesProcessed = new ArrayList<String>();
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



      /*  String regex = "[0-9]*";
        int in = "";
        List<Integer> numbersTokenized = new ArrayList<Integer>();
        StringTokenizer lineTokenizer =
        new StringTokenizer(fileProcessor.fileReader(filePath).toString(), ",");
        while (lineTokenizer.hasMoreTokens()) {
            while (lineTokenizer != null) {
                if (lineTokenizer.nextToken().matches(regex)) {
                    int = lineTokenizer.nextToken();
                    numbersTokenized.add(int);
                    System.out.println(numbersTokenized);
                }

            }*/
