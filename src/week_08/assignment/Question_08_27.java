package week_08.assignment;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        double[][] sortedMatrix = sortColumns(matrix);
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix[i].length; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] sortColumns(double[][] matrix){
        double[][] resultMatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < resultMatrix.length; i++) {
            System.arraycopy(matrix[i],0,resultMatrix[i],0,resultMatrix.length);
        }
        for (int i = 0; i < resultMatrix[0].length; i++) {
            for (int j = 0; j < resultMatrix.length -1; j++) {
                for (int k = j +1; k < resultMatrix.length; k++) {
                    if(resultMatrix[j][i] > resultMatrix[k][i]){
                        double temp = resultMatrix[j][i];
                        resultMatrix[j][i] = resultMatrix[k][i];
                        resultMatrix[k][i] = temp;
                    }
                }
            }
        }
        return resultMatrix;
    }
}
