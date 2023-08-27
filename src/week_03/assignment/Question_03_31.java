package week_03.assignment;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB : ");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa : ");
        int convert = input.nextInt();

        if(convert == 0) {
            System.out.println("Enter the dollar amount : ");
            double dollars = input.nextDouble();
            System.out.println("$" + dollars + " is " + (dollars * exchangeRate) + " yuan" );
        }
        else if(convert == 1){
            System.out.println("Enter the RMB amount : ");
            double rmb = input.nextDouble();
            System.out.println(rmb + " yuan is $" + rmb / exchangeRate);
        }
        else
            System.out.println("Incorrect input!");
    }
}
