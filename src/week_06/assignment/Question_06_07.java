package week_06.assignment;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Years          Future Value");
        for(int i = 1; i <= 30; i++){
            System.out.printf("%-15d %4.2f\n", i, futureInvestmentValue(investmentAmount,
            annualInterestRate / 1200, i));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,
                                               int i){
        return investmentAmount * Math.pow((1 + monthlyInterestRate),i * 12);

    }
}
