package Networking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    static void readTextFromURL(String urlString) {
        try {
            // Open a connection to a URL and get an input stream
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            InputStream urlData = connection.getInputStream();

            // Checks if content is a text
            String contentType = connection.getContentType();
            System.out.println("Stream opened with content type:" + contentType);

            System.out.println("Fetching content from " + urlString + "...");
            System.out.println();

            // Copy text line from input stream until end of line

            BufferedReader reader = new BufferedReader(new InputStreamReader((urlData)));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        readTextFromURL("https://github.com/Evavic44");
    }
}
