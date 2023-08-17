package week_02.assignment;

import java.util.Scanner;
public class Question_02_14 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds : ");
        double pound = input.nextDouble();

        System.out.println("Enter height in inches : ");
        double inch = input.nextDouble();

        double kg = pound * 0.45359237 ;
        double meter = inch * 0.0254 ;

        System.out.println("BMI is " + kg / (Math.pow(meter,2)));
    }
}
