package week_12.question_12_05;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1, side2, and side3: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try {

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        } catch (IllegalTriangleException ex) {
            ex.printStackTrace();

        }


    }

}
