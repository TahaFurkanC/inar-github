package week_04.assignment;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount in dollars and cents : ");
        String strAmount = input.next();

        double doubleValue = Double.parseDouble(strAmount);

        int amount = (int)(doubleValue * 100);

        int dollars = amount / 100 ;
        int remainingAmount = amount % 100 ;
        int quarters = remainingAmount / 25 ;
        remainingAmount %= 25 ;
        int dimes = remainingAmount / 10 ;
        remainingAmount %= 10 ;
        int nickels = remainingAmount / 5 ;
        remainingAmount %= 5 ;
        int pennies = remainingAmount;

        System.out.println("Equivalent in Monetary Units : \nDollars : " + dollars +
                "\nQuarters : " + quarters + "\nDimes : " + dimes + "\nNickels : " + nickels +
                "\nPennies : " + pennies);



    }
}
