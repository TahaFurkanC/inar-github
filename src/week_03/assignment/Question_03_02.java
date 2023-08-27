package week_03.assignment;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);

        System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " = ?");
        int answer = input.nextInt();

        int sum = num1 + num2 + num3 ;

        if(sum== answer)
            System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is true");
        else
            System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is false");


    }
}
