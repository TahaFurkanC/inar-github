package week_13.question_13_17;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b ->");
        double a = input.nextDouble();
        double b = input.nextDouble();

        Complex1 c1 = new Complex1(a, b);

        System.out.print("Enter c, d ->");
        double c = input.nextDouble();
        double d = input.nextDouble();

        Complex1 c2 = new Complex1(c, d);

        System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
        System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));
        System.out.printf("(|%s|) = %.2f" ,c1, c1.abs());


    }
}
