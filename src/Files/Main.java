package Files;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // File operations
        System.out.println(" ");
        File myFile = new File("src/Files/poem.txt");
        File testFile = new File("src/Files/test.txt");
        if(myFile.exists()) {
            System.out.println(myFile.getName() + " exits");
            System.out.println("This relative path of file is " + myFile.getPath());
            System.out.println("This absolute path of file is " + myFile.getAbsolutePath());

            // delete a file
            testFile.delete();
        } else {
            System.out.println("File does not exist");
        }

        // Writing to a file
        File file = new File("src/Files/output.txt"); // File from a relative path
        String[] computers = {"Asus ROG", "Dell", "Apple M1"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("1. Write to a file.");
            writer.write("\n2. Write to next line");

            for (String computer : computers) {
                writer.write("\n" + computer);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Reading a file (File from an absolute path)
        File fileAbsolutePath = new File("C:\\Users\\USER\\Documents\\document.txt");
        // C:/Users/USER/Documents/document.txt also works
       try {
           BufferedReader reader = new BufferedReader(new FileReader(fileAbsolutePath));
           // System.out.println(reader.readLine()); Read the first line in poem.txt
           String line;
           while ((line = reader.readLine()) != null) { // Check if line is empty
               System.out.println(line);
           }
           reader.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
    }
}

/*
 *  File Built-in Methods and Classes
 *  File: Represent a file type and provides classes to work with them
 *  FileInputStream / FileOutputStream: Used for reading and writing binary files
 *  FileReader / FileWriter: Used for reading and writing text files
 *  BufferedReader / BufferedWriter: Used for buffered reading and writing.
 */