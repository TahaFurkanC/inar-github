package week_02.assignment;

import java.util.Scanner;

public class Question_02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F :");
        double fah = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour :");
        double windSpeed = input.nextDouble();

        System.out.println("The wind chill index is " +
                (35.74 + (0.6215*fah) - 35.75* Math.pow(windSpeed,0.16) + 0.4275*fah* Math.pow(windSpeed,0.16)));
    }
}
