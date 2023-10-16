package week_08.assignment;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        System.out.print("Enter matrix1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1[i].length; k++) {
                matrix1[i][k] = input.nextInt();
            }
        }
        System.out.print("Enter matrix2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int k = 0; k < matrix2[i].length; k++) {
                matrix2[i][k] = input.nextInt();
            }
        }
        int[][] newMatrix = addMatrix(matrix1, matrix2);

        System.out.println("The matrices are added as follows");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print(matrix1[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" +   ");
                } else if (i != 1 && j == 2)
                    System.out.print("     ");
            }

            for (int j = 0; j < matrix2[i].length; j++) {

                System.out.print(matrix2[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" =   ");
                } else if (i != 1 && j == 2)
                    System.out.print("     ");
            }

            for (int j = 0; j < newMatrix[i].length; j++) {

                System.out.print(newMatrix[i][j] + " ");
                if (i != 1 && j == 2)
                    System.out.print("    ");
            }
            System.out.println();

        }

    }

    public static int[][] addMatrix(int[][] a, int[][] b) {
        int[][] matrixSum = new int[3][3];
        for (int i = 0; i < matrixSum.length; i++) {
            for (int k = 0; k < matrixSum[i].length; k++) {
                matrixSum[i][k] = a[i][k] + b[i][k];
            }
        }
        return matrixSum;
    }
}
