package week_13.question_13_20;

import week_13.question_13_17.Complex1;

import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (Math.pow(b,2))- (4 * a * c);
        findRoots(discriminant,a,b);
    }
    public static void findRoots(double discriminant, double a, double b){
        if(discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("root1 = " + root1 + " and root2 = " + root2);
        }
        else if(discriminant == 0){
            System.out.println("root is " + (- b / 2 * a));
        }
        else{

            Complex1 root1 = new Complex1(- b / 2 * a,Math.sqrt(Math.abs(discriminant)) / -(2 * a));
            Complex1 root2 = new Complex1(- b / 2 * a,Math.sqrt(Math.abs(discriminant)) / (2 * a));
            System.out.println("root1 = " + root1 + " and root2 = " + root2);
        }

    }
}
