package week_08.assignment;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for(int i = 0; i < matrix.length; i++){
            for(int k = 0; k < matrix[i].length; k++){
                matrix[i][k] = input.nextInt();
            }
        }
        for(int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }
    public static double sumColumn(double[][] matrix,int column){
        double sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][column];
        }
        return sum;
    }
}
