package week_03.assignment;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in pounds : ");
        double pound = input.nextDouble();

        System.out.println("Enter feet : ");
        double feet = input.nextDouble();

        System.out.println("Enter inches : ");
        double inch = input.nextDouble();

        final double POUND_PER_KILOGRAM = 0.45359237 ;
        final double METER_PER_INCH = 0.0254 ;

        double weightInKilograms = pound * POUND_PER_KILOGRAM ;
        double heightInMeter = ((feet * 12) + inch) * METER_PER_INCH ;
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
