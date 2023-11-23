package week_12.question_12_08;

import java.util.Scanner;

public class TestHexFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        try {
            String hex = input.nextLine();
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException ex) {
            System.out.println(ex);
            System.out.println("it is not a hex string.!");
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException{
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if ((hexChar < 'A' || hexChar > 'F') && (hexChar < '0' || hexChar > '9')) {
                throw new HexFormatException();
            }
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }

}
