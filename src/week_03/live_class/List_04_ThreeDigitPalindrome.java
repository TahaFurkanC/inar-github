package week_03.live_class;

import java.util.Scanner;

public class List_04_ThreeDigitPalindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three digit integer : ");
        int user = input.nextInt();

        if(user % 10 == user / 100)
            System.out.println(user + " is a palindrome");
        else
            System.out.println(user + " is not a palindrome");
    }
}
