package week_03.assignment;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package (in pounds) : ");
        double weight = input.nextDouble();

        if(weight <= 0) {
            System.out.println("invalid input!");
            System.exit(1);
        }
        if(weight <= 1)
            System.out.println("Shipping cost of package is $3.5");
        else if(weight <= 3)
            System.out.println("Shipping cost of package is $" + weight * 5.5);
        else if(weight <= 10)
            System.out.println("Shipping cost of package is $" + weight * 8.5);
        else if(weight <= 20)
            System.out.println("Shipping cost of package is $" + weight * 10.5);
        else
            System.out.println("The package cannot be shipped");
    }
}
