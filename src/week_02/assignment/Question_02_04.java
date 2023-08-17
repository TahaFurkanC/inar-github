package week_02.assignment;

import java.util.Scanner;
public class Question_02_04 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final double KG_PER_POUND = 0.454;
        System.out.println("Enter a number in pounds : ");
        double pound = input.nextDouble();

        System.out.println(pound + " pounds is " + KG_PER_POUND * pound + " kilograms");
    }
}
