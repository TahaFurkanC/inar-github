package week_06.assignment;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int number = input.nextInt();

        displayPattern(number);

    }
    public static void displayPattern(int number){
        for(int i = 1; i <= number; i++){
                for(int j = number; j > i;j--)
                    System.out.printf("%2s", " ");
                for(int j = i; j >= 1; j--)
                    System.out.printf("%2d", j);
            System.out.println();
        }
    }
}
