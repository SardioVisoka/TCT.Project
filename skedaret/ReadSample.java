package Librari.skedaret;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadSample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        try {

            // create a File object pointing to the file to read
            File file = new File("sample.txt");

            // create a FileReader to read characters from the file
            FileReader fileReader = new FileReader(file);

            // wrap FileReader with BufferedReader to read text efficiently, line by line
             bufferedReader = new BufferedReader(fileReader);

            String line;
            // read each line until the end of the file (null means end of file)
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // always close the reader when done
            if (bufferedReader != null)
                bufferedReader.close();
        }
    }
}
