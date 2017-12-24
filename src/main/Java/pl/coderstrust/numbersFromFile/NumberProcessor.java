package pl.coderstrust.numbersFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// responsible for transforming list of numbers to sum of numbers and its result

public class NumberProcessor {
    List<String> line = new ArrayList<String>();

    public static void numberProcessor() throws IOException {
        FileProcessor fileProcessor = new FileProcessor();
        String input = fileProcessor.fileRader().toString();

        int sum = 0;

        char[] c = input.toCharArray();

        for(int i = 0;i<=c.length-1;i++)
        {
            if(Character.isDigit(c[i]))
            {
                Character c1 = c[i];
                String s1 = c1.toString();
                int i1 = Integer.parseInt(s1);

                sum = sum+i1;
            }
        }
        System.out.println(sum);

    }
}


