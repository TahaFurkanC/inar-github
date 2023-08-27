package week_03.assignment;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer : ");
        int user = input.nextInt();
        int number = user;
        int n3 = number % 10 ;
        number /= 10 ;
        int n2 = number % 10 ;
        number /= 10 ;
        int n1 = number ;

        if(n1 == n3)
            System.out.println(user + " is a palindrome");
        else
            System.out.println(user + " is not a palindrome");
    }
}
