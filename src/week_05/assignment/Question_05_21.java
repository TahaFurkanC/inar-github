package week_05.assignment;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Loan Amount : ");
        int loan = input.nextInt();
        System.out.print("Number of Years : ");
        int years = input.nextInt();

        System.out.println("Interest Rate       Monthly Payment     Total Payment");

        for(double i = 5; i <= 8; i += 0.125){

            double monthlyInterestRate = i / 1200;

            double monthlyPayment = loan * monthlyInterestRate /
                    (1 - (1 / Math.pow(1 + monthlyInterestRate, years * 12)));

            double totalPayment = monthlyPayment * years * 12 ;

            System.out.printf("%5.3f", i);
            System.out.print("%");
            System.out.printf("\t\t\t\t%6.2f \t\t\t\t%8.2f" , monthlyPayment , totalPayment);
            System.out.println("");
        }

    }
}
