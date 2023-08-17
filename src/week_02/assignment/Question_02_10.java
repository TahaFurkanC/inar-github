package week_02.assignment;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms : ");
        double kg = input.nextDouble();
        System.out.println("Enter the initial temperature : ");
        double intemp = input.nextDouble();
        System.out.println("Enter the final temperature ");
        double fintemp = input.nextDouble();

        double Q = kg * (fintemp - intemp) * 4184;

        System.out.println("The energy needed is " + Q);
    }
}
