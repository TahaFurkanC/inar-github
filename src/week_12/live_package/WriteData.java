package week_12.live_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    // Main method - the entry point of the program
    public static void main(String[] args) throws FileNotFoundException {
        // Create a File object representing the file "scores.txt"
        File file = new File("scores.txt");

        // Check if the file already exists
        if (file.exists()) {
            // If the file exists, print a message to the console
            System.out.println("File already exists");
            // Exit the program with a status code of 1 indicating an error
            System.exit(1);
        }

        // Create a PrintWriter object for writing to the file
        // This also creates the file if it does not exist
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        // Write the string "John T Smith " followed by the number 90 and a newline
        output.print("John T Smith ");
        output.println(90);

        // Write another line to the file with a different name and score
        output.print("Eric K Jones ");
        output.println(85);

        // Close the file
        // This is important to ensure that all data is actually written to the file
        // and to release system resources associated with the file
        output.close();

    }
}
