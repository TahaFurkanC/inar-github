package week_10.assignments.question_10_15;

import week_10.assignments.question_10_13.MyRectangle2D;

import java.util.Scanner;

public class BoundingRectangle {
    public static void main(String[] args) {
        double[][] points = getFromUser();
        MyRectangle2D r = getRectangle(points);

        System.out.println("The bounding rectangle's center (" + r.getX() + ", " + r.getY() + "), width "
                + r.getWidth() + ", height " + r.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double lowX = points[0][0];
        double lowY = points[0][1];
        double highX = points[0][0];
        double highY = points[0][1];


        for (int p = 1; p < points.length; p++) {
            if (points[p][0] < lowX) {
                lowX = points[p][0];
            }
            if (points[p][1] < lowY) {
                lowY = points[p][1];
            }
            if (points[p][0] > highX) {
                highX = points[p][0];
            }
            if (points[p][1] > highY) {
                highY = points[p][1];
            }
        }

        double width = highX - lowX;
        double height = highY - lowY;

        double centerX = lowX + (width/2);  // or --> highX - (width / 2);
        double centerY = lowY + (width/2);  // or --> highY - (height / 2);

        return new MyRectangle2D(centerX, centerY, width, height);

    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];

        for (int p = 0; p < points.length; p++) {
            points[p][0] = input.nextDouble();
            points[p][1] = input.nextDouble();
        }
        return points;
    }
}
