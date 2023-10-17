package week_08.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511");
        int decimalNum = input.nextInt();
        int[] binaryValue = getBinaryValue(decimalNum);
        System.out.println(Arrays.toString(binaryValue));
        displayHeadTails(binaryValue);
    }

    public static int[] getBinaryValue(int number) {
        int[] binaryValue = new int[9];
        int i = binaryValue.length - 1;
        while (number != 0) {
            int currentRemainder = number % 2;
            number = number / 2;
            binaryValue[i] = currentRemainder;
            i--;

        }
        return binaryValue;
    }

    public static void displayHeadTails(int[] binaryValue) {
        int count = 0;
        for (int i = 0; i < binaryValue.length; i++) {
            count++;
            if (binaryValue[i] == 0) {
                System.out.print(count % 3 == 0 ? "H\n" : "H ");
            } else {
                System.out.print(count % 3 == 0 ? "T\n" : "T ");
            }

        }
    }
}
