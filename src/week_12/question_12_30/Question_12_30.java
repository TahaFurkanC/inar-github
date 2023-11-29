package week_12.question_12_30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("Enter the gender: ");
        char gender = input.nextLine().charAt(0);

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        File file =
                new File("C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\question_12_30\\babyNames\\babynameranking" + year + ".txt");
        try (
                Scanner input1 = new Scanner(file);
        ) {

            int rank = 1;
            boolean isFound = false;
            while (input1.hasNext()) {
                String str = input1.nextLine();
                String[] line = str.split("[ \t]");

                int nameInLine = (gender == 'M' ? 1 : 3);
                if (line[nameInLine].compareTo(name) == 0) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    isFound = true;
                    break;
                }
                rank++;
            }

            if (!isFound) {
                System.out.println("The name you entered is not in the list.");
            }
        }
    }
}
