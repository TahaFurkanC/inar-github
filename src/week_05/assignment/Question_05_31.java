package week_05.assignment;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount : ");
        double deposit = input.nextDouble();
        System.out.print("Enter annual percentage yield : ");
        double annualPercentage = input.nextDouble();
        System.out.print("Enter maturity period (number of months) : ");
        int months = input.nextInt();

        System.out.println("Month     CD Value");
        for(int i = 1; i <= months; i++){
            deposit += deposit * (annualPercentage / 1200);

            System.out.printf("%-5s %12.2f\n" , i , deposit);
        }
    }
}
