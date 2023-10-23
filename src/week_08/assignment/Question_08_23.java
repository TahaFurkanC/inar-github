package week_08.assignment;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix:");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
                if(matrix[i][j] != 0 && matrix[i][j] != 1){
                    System.out.println("Invalid input!");
                    System.exit(1);
                }
            }
        }
        System.out.println("The flipped cell is at (" + flippedRow(matrix) + "," +
                flippedColumn(matrix) + ")");
    }
    public static int flippedRow(int[][] matrix){
        int a = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count % 2 != 0)
                a = i;
        }
        return a;
    }
    public static int flippedColumn(int[][] matrix){
        int result = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == 1)
                    count++;
            }
            if(count % 2 != 0)
                result = i;
        }
        return result;
    }
}
