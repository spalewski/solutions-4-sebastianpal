package pl.coderstrust.numbersFromFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileProcessor {
    public List<String> fileRader() throws IOException {
        String regex = "[a-z ()]";
        String line = null;
        List<String> records = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000.txt"))) {
            //if (!bufferedReader.readLine().matches(regex))   {
            while ((line = bufferedReader.readLine()) != null) {

                bufferedReader.readLine();
                records.add(line);
                Collections.sort(records);
                // }
            }
            bufferedReader.close();
            //   }

            return records;
        }
    }
}

    //public static void fileProcessoerWriter() throws IOException {

     //   BufferedWriter writer = new BufferedWriter(new FileWriter("src" + File.separator + "test" + File.separator + "resources" + File.separator + "1000_processed.txt"));

        //writer.write();
     //   writer.newLine();
      //  writer.close();
    //}

//}
