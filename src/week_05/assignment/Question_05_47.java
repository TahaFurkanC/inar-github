package week_05.assignment;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string ");
        String isbn = input.next();
        int sum = 0;

        if(isbn.length() != 12) {
            System.out.println("Invalid input!");
            System.exit(1);
        }

        for(int i = 0; i < 12; i++){
            char a = isbn.charAt(i);
            int b = a - '0';
            if(i % 2 == 0){
                sum += 3 * b;
            }
            else
                sum += b;

        }

        int checksum = 10 - sum % 10;

        if(checksum == 10)
            checksum = 0;
        System.out.println("The ISBN-13 number is " + isbn + "" + checksum);

    }
}
