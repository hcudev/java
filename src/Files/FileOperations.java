package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileOperations {
        static void readFile(String filePath) {
        File file = new File(filePath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            // Loop through content of the file
            String line;
            while ((line = reader.readLine()) != null) { // Check if line is empty
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void writeFile(String filePath, String words) {
        File file = new File(filePath);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            System.out.println("Writing to file...");
            writer.write(words);
            System.out.println("WORDS:\n" + words);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
     System.out.println("Reading file: Relative Path...");
     readFile("src/Files/poem.txt"); // Read file in relative path
     System.out.println();
     System.out.println("Reading file: Absolute Path...");
     readFile("C:\\Users\\USER\\Documents\\document.txt"); // Read file at absolute path

     writeFile("test.txt", "Hello World! My name is Victor Eke");
     readFile("names.txt");
    }
}