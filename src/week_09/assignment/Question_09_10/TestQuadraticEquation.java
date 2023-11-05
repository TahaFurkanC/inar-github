package week_09.assignment.Question_09_10;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation object = new QuadraticEquation(a,b,c);

        if(object.getDiscriminant() > 0){
            System.out.println("The equation has two roots " + object.getRoot1() + " and "
                    + object.getRoot2());
        }
        else if(object.getDiscriminant() == 0){
            System.out.println("The equation has one root " + object.getRoot1());
        }
        else
            System.out.println("The equation has no real roots");
    }
}
