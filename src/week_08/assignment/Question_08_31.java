package week_08.assignment;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        System.out.println("Enter four points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double[] result = getIntersectingPoint(points);

        if (result == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at (" + result[0] + ", " + result[1] + ")");
        }

    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[][] a = new double[2][2];

        double[] b = new double[2];

        a[0][0] = points[0][1] - points[1][1];
        a[0][1] = -1 * (points[0][0] - points[1][0]);
        a[1][0] = points[2][1] - points[3][1];
        a[1][1] = -1 * (points[2][0] - points[3][0]);

        b[0] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        b[1] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        return Question_08_30.linearEquation(a, b);
    }

}

