package week_08.assignment;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] matrix = new double[row][column];
        System.out.println("Enter the array:");
        double max = 0;
        String location = "";
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    location = "(" + i + "," + j +")";
                }
            }
        }
        System.out.println("The location of the largest element is at " + location);
    }
}
