package week_04.assignment;

import java.util.Scanner;
public class Question_04_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer : ");
        String user = input.next();

        char ch0 = user.charAt(0);
        char ch1 = user.charAt(1);
        char ch2 = user.charAt(2);
        char ch3 = user.charAt(3);
        char ch4 = user.charAt(4);
        char ch5 = user.charAt(5);
        char ch6 = user.charAt(6);
        char ch7 = user.charAt(7);
        char ch8 = user.charAt(8);

        int sum = ((ch0-48) + (ch1-48) * 2 + (ch2-48) * 3 + (ch3-48) * 4 + (ch4-48) * 5 + (ch5 - 48) * 6 +
                (ch6 - 48) * 7 + (ch7 - 48) * 8 + (ch8 - 48) * 9) ;

        if(sum % 11 == 10){
            System.out.println("The ISBN-10 number is " + user + "X");
        }
        else
            System.out.println("The ISBN-10 number is " + user + (sum % 11));
    }
}
