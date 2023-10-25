package week_08.assignment;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3:");
        double[][] points = new double[3][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double result = getTriangleArea(points);
        if (result == 0)
            System.out.println("The three points are on the same line");
        else
            System.out.printf("The area of the triangle is %.2f\n", result);

    }
    public static double getTriangleArea(double[][] points) {
        double[] side = new double[3];

        if (linePosition(points) == 0) {
            return 0;
        }
        side[0] = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2));

        side[1] = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2));

        side[2] = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2));

        double s = 0;
        for (double e : side) {
            s += e;
        }
        s /= 2;

        double area = 1;
        for (int i = 0; i < side.length; i++) {
            area *= (s - side[i]);
        }
        return Math.sqrt(s * area);
    }

    public static double linePosition(double[][] points) {
        return  (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) -
                (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
    }
}
