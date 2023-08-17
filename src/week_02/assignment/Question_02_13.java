package week_02.assignment;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        final double INTEREST_RATE = 0.05/12;
        System.out.println("Enter the monthly saving amount : ");
        double savingAmount = input.nextDouble();
        double totalAmount = 0;

        totalAmount = (totalAmount + savingAmount) * (1 + INTEREST_RATE);
        totalAmount = (totalAmount + savingAmount) * (1 + INTEREST_RATE);
        totalAmount = (totalAmount + savingAmount) * (1 + INTEREST_RATE);
        totalAmount = (totalAmount + savingAmount) * (1 + INTEREST_RATE);
        totalAmount = (totalAmount + savingAmount) * (1 + INTEREST_RATE);
        totalAmount = (totalAmount + savingAmount) * (1 + INTEREST_RATE);

        System.out.println(" After the sixth month, the account value is $" + totalAmount);



    }
}
