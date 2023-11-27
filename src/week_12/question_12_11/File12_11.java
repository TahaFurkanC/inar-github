package week_12.question_12_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class File12_11 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage java Exercise12_11 String fileName");
            return;
        }

        File file = new File(args[1]);
        String toRemove = args[0];
        String s1 = "";
        String s2 = "";

        if (!file.exists()) {
            System.out.println("The file " + file.getName() + " does not exist");
            return;
        }
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                s1 += input.nextLine() + "\n";
                s2 = s1.replaceAll(toRemove, "");
            }

        }

        PrintWriter output = new PrintWriter(file);
        output.print(s2);
        output.close();
    }
}