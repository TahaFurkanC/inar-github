package week_11.question_11_15;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvexPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points: ");
        int numberOfPoints = input.nextInt();

        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < numberOfPoints * 2; i++) {
            points.add(input.nextDouble());
        }
        System.out.println("The total area is " + getArea(points));
    }

    //1-x1 2-y1 3-x2 4-y2 5-x3 6-y3 7-x4 8-y4
    public static ArrayList<Double> getReversePoints(ArrayList<Double> points) {
        ArrayList<Double> reversedPoints = new ArrayList<>();
        for (int i = points.size() - 1; i >= 0; i -= 2) {
            reversedPoints.add(points.get(i - 1));
            reversedPoints.add(points.get(i));
        }
        return reversedPoints;
    }

    public static double getArea(ArrayList<Double> points) {

        ArrayList<Double> reversedPoints = getReversePoints(points);
        double sum1 = 0;
        double sum2 = 0;
        int n = reversedPoints.size();
        for (int i = 0; i <= reversedPoints.size() / 2; i += 2) {
            sum1 += reversedPoints.get(i) * reversedPoints.get(i + 3);
            sum2 += reversedPoints.get(i + 1) * reversedPoints.get(i + 2);
        }
        sum1 += reversedPoints.get(n - 2) * reversedPoints.get(1);
        sum2 += reversedPoints.get(n - 1) * reversedPoints.get(0);

        return Math.abs(sum1 - sum2) / 2;
    }
}
