package week_05.assignment;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the commission sought : ");
        double salesAmount = input.nextDouble();
        double commision = 0;
        double salary = 5000;

        while (commision + salary < salesAmount) {
            commision = 0;
            commision += 5000 * 0.08;
            commision += 5000 * 0.10;
            commision += (salesAmount - 10000) * 0.12;
            salesAmount += 0.01;
        }
        System.out.printf("Minimum sales to earn $" + salesAmount + " : %3.2f" , salesAmount);
    }
}
