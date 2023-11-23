package week_12.question_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionHandling {
    public static void main(String[] args) {
        tryAgain();
    }

    private static void tryAgain() {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter two integers to sum:");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println("Sum of " + number1 + " + " + number2
                    + " is " + (number1 + number2));
        }
        catch (InputMismatchException ex){
            System.out.println("Wrong input! Please enter integer :");
            input.nextLine();
            tryAgain();
        }
    }
}
