package week_02.assignment;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter take-off speed and accelaration : ");
        double speed = input.nextDouble();
        double a = input.nextDouble();

        System.out.println("The minimum runway length for this airplane is " +
                Math.pow(speed,2) / (2 * a));
    }
}
