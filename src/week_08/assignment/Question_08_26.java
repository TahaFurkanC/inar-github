package week_08.assignment;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("The row sorted array is ");
        double[][] sortedArray = sortRows(matrix);
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray[i].length; j++) {
                System.out.print(sortedArray[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] sortRows(double[][] matrix){
        double[][] newMatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < newMatrix.length; i++) {
            System.arraycopy(matrix[i],0,newMatrix[i],0,matrix.length);
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length-1; j++) {
                for (int k = j+1; k < newMatrix[i].length; k++) {
                    if(newMatrix[i][j] > newMatrix[i][k]){
                        double temp = newMatrix[i][j];
                        newMatrix[i][j] = newMatrix[i][k];
                        newMatrix[i][k] = temp;
                    }
                }
            }
        }
        return newMatrix;
    }
}
