package week_02.assignment;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount as integer, for example 1156 for 11.56 : ");
        int number = input.nextInt();

        int dollars = number / 100;
        int quarters = (number % 100) / 25;
        int dimes =  (number % 25) / 10;
        int nickles = (number % 10) / 5;
        int pennies = number % 5 ;

        System.out.println("Your amount " + number + "consists of\n" +
                dollars + " dollars\n" +
                quarters +  " quarters\n" +
                dimes + " dimes\n" +
                nickles + " nickels\n" +
                pennies + " pennies");
    }
}
