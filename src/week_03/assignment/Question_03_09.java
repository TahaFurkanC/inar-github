package week_03.assignment;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer : ");
        int user = input.nextInt();
        long checksum = 0 ;
        int isbn = user ;

        checksum += isbn % 10 * 9 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 8 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 7 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 6 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 5 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 4 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 3 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 2 ;
        isbn /= 10 ;
        checksum += isbn % 10 * 1 ;


        if(checksum % 11 == 10) {
            if (isbn == 0)
                System.out.println("The ISBN-10 number is 0" + user + "X");
            else
                System.out.println("The ISBN-10 number is " + user + "X");
        }
        else if (isbn == 0)
            System.out.println("The ISBN-10 number is 0" + user + (checksum % 11));
        else
            System.out.println("The ISBN-10 number is " + user + "" + (checksum % 11));
    }
}
