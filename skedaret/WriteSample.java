package Librari.skedaret;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class WriteSample {
    public static void main(String[] args) {
        try {
            // create a File object
            File file = new File("sample.txt");

            // FileWriter writes character by character
            FileWriter fileWriter = new FileWriter(file, true);

            // BufferedWriter wraps FileWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // write a line in file
            bufferedWriter.write("Welcome to file handling in Java.");
            // adds a new line
            bufferedWriter.newLine();
            bufferedWriter.write("TCT Bootcamp!");

            // always close the writer when done
            bufferedWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
