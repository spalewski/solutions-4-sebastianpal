package pl.coderstrust.numbersFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        String regex = "[0-9 \\s , \\n]*";
        FileProcessor fileProcessor = new FileProcessor();
        String line = "";
        ArrayList<ArrayList<String>> numbersTokenized = new ArrayList<ArrayList<String>>();
        StringTokenizer lineTokenizer =
  new StringTokenizer(fileProcessor.fileRader().toString(), ",");
      while (lineTokenizer.hasMoreTokens()) {
  while (lineTokenizer != null) {
            if (lineTokenizer.nextToken().matches(regex)) {
            line = lineTokenizer.nextToken();
                System.out.println(line);



                        }

                    }
                }
            }
        }





