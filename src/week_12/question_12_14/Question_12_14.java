package week_12.question_12_14;

import java.io.File;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file´s path name:");
        String name = input.next();

        File file = new File(name);

        if (!file.exists()) {
            System.out.println("File " + name + " doesnt exist!");
            return;
        }
        int count = 0;
        double sum = 0;
        try (
                Scanner input2 = new Scanner(file);
        ) {
            while (input2.hasNext()) {
                sum += input2.nextDouble();
                count++;
            }
            System.out.println("Sum of the numbers in file : " + sum);
            System.out.println("Average of these numbers : " + sum / count);
        }

    }
}
