package week_12.live_package;

import java.util.Scanner;

public class ReadData {
    // Main method - the entry point of the program
    public static void main(String[] args) throws Exception {
        // Create a File object for the file "scores.txt"
        java.io.File file = new java.io.File("scores.txt");

        // Create a Scanner object for reading data from the file
        // This assumes that the file "scores.txt" exists and is accessible
        Scanner input = new Scanner(file);

        // Read data from the file using a while loop
        // The loop continues as long as there is more data to read (input.hasNext())
        while (input.hasNext()) {
            // Read a first name from the file
            String firstName = input.next();

            // Read a middle initial from the file
            String mi = input.next();

            // Read a last name from the file
            String lastName = input.next();

            // Read an integer score from the file
            int score = input.nextInt();

            // Print the read data to the console in a formatted manner
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }

        // Close the Scanner object
        // This is important to release the resources associated with the Scanner
        input.close();
    }
}
