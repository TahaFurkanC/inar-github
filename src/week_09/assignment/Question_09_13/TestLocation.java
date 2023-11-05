package week_09.assignment.Question_09_13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter the array: ");
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextInt();
            }
        }
        Location location = Location.locateLargest(array);
        System.out.println("The location of the largest element is " +
                location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }
}
