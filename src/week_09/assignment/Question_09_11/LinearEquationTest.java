package week_09.assignment.Question_09_11;

import java.util.Scanner;

public class LinearEquationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation object = new LinearEquation(a,b,c,d,e,f);

        if(object.isSolvable()){
            System.out.println("x is " + object.getX() +
                    " and y is " + object.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
    }
}
