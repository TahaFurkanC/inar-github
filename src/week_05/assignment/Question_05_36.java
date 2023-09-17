package week_05.assignment;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer : ");
        String isbn = input.next();

        int d10 = 0;
        if(isbn.length() != 9){
            System.out.println("Wrong input!");
            System.exit(1);
        }
        else {
            for (int i = 0; i < 9; i++) {
                int digit = Integer.parseInt(isbn.charAt(i) + "");
                d10 += digit * (i + 1);
            }

            d10 %= 11;
            System.out.print("The ISBN-10 number is ");
            for (int i = 0; i < 9; i++) {
                System.out.print(isbn.charAt(i));
            }
            if (d10 == 10)
                System.out.print("X");
            else
                System.out.print(d10);
        }
    }
}
