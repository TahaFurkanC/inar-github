package week_02.assignment;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius : ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + "Fahrenheit");
    }
}
