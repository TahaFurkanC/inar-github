package week_02.assignment;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance : ");
        double distance = input.nextDouble();

        System.out.println("Enter miles per galon : ");
        double milesPerGalon = input.nextDouble();

        System.out.println("Enter price per galon : ");
        double pricePerGalon = input.nextDouble();

        double neededGalon = distance / milesPerGalon ;

        System.out.println("The cost of driving is $" + Math.floor((neededGalon * pricePerGalon) * 100) /100.0 );

    }
}
