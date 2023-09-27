package week_06.assignment;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle :");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        if (isValid(x, y, z))
            System.out.println("The area of the triangle is " + computeArea(x, y, z));
        else
            System.out.println("Invalid input!");
    }

    public static boolean isValid(double x, double y, double z) {
        if ((x + y) < z) {
            return false;
        } else if ((x + z) < y) {
            return false;
        } else if ((y + z) < x) {
            return false;
        } else {
            return true;
        }
    }
    public static double computeArea(double x, double y , double z){
        double s = (x + y + z) / 2;

        return Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }
}

