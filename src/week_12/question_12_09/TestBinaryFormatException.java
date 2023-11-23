package week_12.question_12_09;

import java.util.Scanner;

public class TestBinaryFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryString = input.nextLine();
        try {
            System.out.println(binaryString + " = decimal of " + bin2Dec(binaryString));
        } catch (BinaryFormatException ex) {
            System.out.println(ex);
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int sum = 0;

        for (int j = 0, i = binaryString.length() - 1; i >= 0; i--, j++) {
            if (binaryString.charAt(i) == '1') {
                sum += Math.pow(2, j) * 1;
            } else if (binaryString.charAt(i) == '0') {
                sum += Math.pow(2, j) * 0;
            } else {
                throw new BinaryFormatException("It is not a binary string Invalid input");
            }
        }
        return sum;
    }

}
