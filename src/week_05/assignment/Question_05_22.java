package week_05.assignment;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount : ");
        int loan = input.nextInt();
        System.out.print("Number of Years : ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate : ");
        double rate = input.nextInt();

        double monthlyInterestRate = rate / 1200;
        double monthlyPayment = loan * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        System.out.printf("Monthly Payment : %.2f\n" , monthlyPayment);
        double totalPayment = monthlyPayment * years * 12;
        System.out.printf("Total Payment : %.2f\n" , totalPayment);

        double balance = totalPayment;

        System.out.println("Payment#    Interest         Principal      Balance");

        for(int i = 1; i <= 12; i++){

            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance -= principal;

            System.out.printf("%d\t\t\t %.2f\t\t\t %.2f\t\t\t %.2f\n" , i, interest, principal, balance);
        }
    }
}
