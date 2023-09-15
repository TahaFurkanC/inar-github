package week_05.assignment;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g., 100) : ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g. , 5) :");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g. , 6) : ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double compoundValue = 0;
        for(int i = 1; i <= months; i++){
            compoundValue = (amount + compoundValue) * ( 1 + monthlyInterestRate);
        }
        System.out.printf("Amount in savings account after " + months + " months : %5.2f" , compoundValue);
    }
}
