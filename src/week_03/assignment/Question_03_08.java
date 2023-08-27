package week_03.assignment;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 different integers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if(number1 > number2){
            int temp = number1 ;
            number1 = number2 ;
            number2 = temp ;
        }
        if(number1 > number3){
            int temp = number1 ;
            number1 = number3 ;
            number3 = temp ;
        }
        if(number2 > number3){
            int temp = number2 ;
            number2 = number3 ;
            number3 = temp ;
        }
        System.out.print(number1 + " < " + number2 + " < " + number3);
    }
}
