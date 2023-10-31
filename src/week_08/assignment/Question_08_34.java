package week_08.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 points:");
        double[][] points = new double[6][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        System.out.println("The rightmost lowest point is " + Arrays.deepToString(getRightmostLowestPoint(points)));
    }

    public static double[][] getRightmostLowestPoint(double[][] points) {
        double[][] rightmostLowest = new double[1][2];
        rightmostLowest[0][0] = points[0][0];
        rightmostLowest[0][1] = points[0][1];
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][1] > points[j][1]) {
                    rightmostLowest[0][0] = points[j][0];
                    rightmostLowest[0][1] = points[j][1];
                }if(points[i][1] == points[j][1]) {
                    if (points[i][0] > points[j][0]) {
                        rightmostLowest[0][0] = points[i][0];
                        rightmostLowest[0][1] = points[i][1];
                    }
                    else{
                        rightmostLowest[0][0] = points[j][0];
                        rightmostLowest[0][1] = points[j][1];
                    }
                }

            }
        }
        return rightmostLowest;
    }
}
