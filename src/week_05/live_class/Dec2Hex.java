package week_05.live_class;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal");
        int decimal = input.nextInt();

        String hex = "";

        while(decimal != 0){
            char hexDigit = decimal % 16 >= 0 && decimal % 16 <= 9 ? (char)(decimal % 16 + '0')
                    : (char)(decimal % 16 -10 + 'A');
            hex = hexDigit + hex ;
            decimal /= 16;
        }
        System.out.println("The hex number is " + hex);
    }
}
