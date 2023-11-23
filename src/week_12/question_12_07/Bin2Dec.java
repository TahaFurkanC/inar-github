package week_12.question_12_07;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryString = input.nextLine();
        try {
            System.out.println(binaryString + " = decimal of " + bin2Dec(binaryString));
        } catch (NumberFormatException ex) {
            System.out.println("Value must be binary!");
        }
    }

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int sum = 0;

        for (int j = 0, i = binaryString.length() - 1; i >= 0; i--, j++) {
            if (binaryString.charAt(i) == '1') {
                sum += Math.pow(2, j) * 1;
            } else if (binaryString.charAt(i) == '0') {
                sum += Math.pow(2, j) * 0;
            } else {
                throw new NumberFormatException("Invalid input");
            }
        }
        return sum;
    }

}
