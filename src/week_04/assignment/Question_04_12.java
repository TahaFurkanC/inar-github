package week_04.assignment;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex digit: ");
        String hex = input.next().toUpperCase();

        String hexDigits = "0123456789ABCDEF" ;

        if(hexDigits.contains(hex)){
            hex = hex.replaceAll("0", "0000");
            hex = hex.replaceAll("1", "0001");
            hex = hex.replaceAll("2", "0010");
            hex = hex.replaceAll("3", "0011");
            hex = hex.replaceAll("4", "0100");
            hex = hex.replaceAll("5", "0101");
            hex = hex.replaceAll("6", "0110");
            hex = hex.replaceAll("7", "0111");
            hex = hex.replaceAll("8", "1000");
            hex = hex.replaceAll("9", "1001");
            hex = hex.replaceAll("A", "1010");
            hex = hex.replaceAll("B", "1011");
            hex = hex.replaceAll("C", "1100");
            hex = hex.replaceAll("D", "1101");
            hex = hex.replaceAll("E", "1110");
            hex = hex.replaceAll("F", "1111");
            System.out.println("The binary value is " + hex);
        }


    }
}
