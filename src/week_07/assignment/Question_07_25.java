package week_07.assignment;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");

        double[] eqn = new double[3];
        double[] roots = new double[3];

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        int rootNumber = getRootNumber(eqn, roots);

        if (rootNumber == 0) {
            System.out.println("The equation has no real root.");

        } else {
            System.out.print("The number of real roots: " + rootNumber + "\nThe root(s) of equation: ");
            for (int i = 0; i < rootNumber; i++) {
                System.out.print(roots[i] + " ");
            }
        }
    }

    public static int getRootNumber(double[] eqn, double[] roots) {
        double delta = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        if (delta > 0) {
            roots[0] = (-eqn[1] + Math.pow(delta, 0.5)) / 2;
            roots[1] = (-eqn[1] - Math.pow(delta, 0.5)) / 2;
            return 2;

        } else if (delta == 0) {
            roots[0] = (-eqn[1] + Math.pow(delta, 0.5)) / 2;
            return 1;
        }
        return 0;
    }
}
