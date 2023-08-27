package week_03.assignment;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 100) ;
        int number2 = (int)(Math.random() * 100) ;

        System.out.println("What is " + number1 + " + " + number2 + " = ? ");
        int user = input.nextInt();

        if(number1 + number2 == user)
            System.out.println("You are correct !");
        else
            System.out.println("You are wrong ! " + number1 + " + " + number2 + " should be " + (number1 + number2));


    }


}
