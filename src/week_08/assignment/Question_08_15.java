package week_08.assignment;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points:");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        if (sameLine(points)) {
            System.out.println("The five points are on the same line.");
        } else {
            System.out.println("The five points are not on the same line.");
        }
    }

    public static boolean sameLine(double[][] points) {
        if ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) -
                (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) != 0) {
            return false;
        }
        return true;
    }
}
