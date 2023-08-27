package week_03.live_class;

import java.util.Scanner;

public class List_03_BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in pounds");
        double pound = input.nextDouble();

        System.out.println("Enter your height in inches");
        double inch = input.nextDouble();

        final double POUND_PER_KILOGRAM = 0.45359237 ;
        final double INCH_PER_METER = 0.0254 ;

        double weightInKilograms = pound * POUND_PER_KILOGRAM ;
        double heightInMeter = inch * INCH_PER_METER ;
        double bmi = weightInKilograms / (Math.pow(heightInMeter,2)) ;

        System.out.println("BMI is " + bmi);

        if(bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi < 25.0)
            System.out.println("Normal");
        else if(bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}
