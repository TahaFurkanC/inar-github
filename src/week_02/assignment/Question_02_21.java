package week_02.assignment;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount : ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in annualInterestRate : ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Enter number of years : ");
        int years = input.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow( 1 + annualInterestRate / 1200,years * 12);
        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
