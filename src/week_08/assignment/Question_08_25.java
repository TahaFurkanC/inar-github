package week_08.assignment;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by- matrix row by row:");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("It is " + (isMarkovMatrix(matrix) ? "a" : "not a") + " Markov matrix");
    }
    public static boolean isMarkovMatrix(double[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            double total = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] > 0){
                    total += matrix[j][i];
                }else
                    return false;
            }
            if(total != 1)
                return false;
        }
        return true;
    }
}
