package week_03.assignment;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount (e.g 11,56) : ");
        double amount = input.nextDouble();

        int withoutComma = (int)(amount * 100);

        int dollar = withoutComma / 100 ;

        int quarter = (withoutComma % 100) / 25 ;

        int dime = (withoutComma % 25) / 10 ;

        int nickel = (withoutComma % 10) / 5 ;

        int penny = withoutComma % 5 ;

        System.out.println("Your amount " + amount + " consist of ");
        System.out.println(dollar + (dollar == 1 ? " dollar " : " dollars "));
        System.out.println(quarter + (quarter == 1 ? " quarter " : " quarters "));
        System.out.println(dime + (dime == 1 ? " dime " : " dimes "));
        System.out.println(nickel + (nickel == 1 ? " nickel " : " nickels "));
        System.out.println(penny + (penny == 1 ? " penny " : " pennies"));
    }
}
