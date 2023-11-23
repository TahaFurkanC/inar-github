package week_12.live_package;

public class TestFileClass {
    public static void main(String[] args) {
        // Create a File object representing the file "image/us.gif"
        java.io.File file = new java.io.File(System.getProperty("user.dir") + "/src/exceptions_fileio/xyz.txt");


        // Check if the file exists and print the result
        System.out.println("Does it exist? " + file.exists());

        // Print the size of the file in bytes
        System.out.println("The file has " + file.length() + " bytes");

        // Check if the file is readable and print the result
        System.out.println("Can it be read? " + file.canRead());

        // Check if the file is writable and print the result
        System.out.println("Can it be written? " + file.canWrite());

        // Check if the file object represents a directory and print the result
        System.out.println("Is it a directory? " + file.isDirectory());

        // Check if the file object represents a regular file and print the result
        System.out.println("Is it a file? " + file.isFile());

        // Check if the file path is absolute and print the result
        System.out.println("Is it absolute? " + file.isAbsolute());

        // Check if the file is hidden and print the result
        System.out.println("Is it hidden? " + file.isHidden());

        // Print the absolute path of the file
        System.out.println("Absolute path is " + file.getAbsolutePath());

        // Print the last modified timestamp of
        System.out.println("Last modified on " +
                new java.util.Date(file.lastModified()));

    }
}
