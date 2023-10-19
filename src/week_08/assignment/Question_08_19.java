package week_08.assignment;

import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int row = input.nextInt();
        System.out.print("Enter column number: ");
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Fill the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix has " + (isConsecutiveFour(matrix) ? "consecutive four numbers" :
                "not consecutive four numbers"));
    }
    public static boolean isConsecutiveFour(int[][] matrix){
        if(checkRow(matrix) || checkColumn(matrix) ||
                checkMajorDiagonal(matrix) || checkSubDiagonal(matrix)){
            return true;
        }
        return false;
    }
    public static boolean checkRow(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length -3; j++) {
                if(matrix[i][j] == matrix[i][j+1] && matrix[i][j] == matrix[i][j+2] &&
                matrix[i][j] == matrix[i][j +3]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkColumn(int[][] matrix){
        for (int i = 0; i < matrix.length -3; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == matrix[i+1][j] && matrix[i][j] == matrix[i+2][j] &&
                matrix[i][j] == matrix[i+3][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkMajorDiagonal(int[][] matrix){
        for (int i = 0; i < matrix.length -3; i++) {
            if(matrix[i][i] == matrix[i+1][i+1] && matrix[i][i] == matrix[i+2][i+2]
            && matrix[i][i] == matrix[i+3][i+3]){
                return true;
            }
        }
        return false;
    }
    public static boolean checkSubDiagonal(int[][] matrix){
        for (int i = 0; i < matrix.length -3; i++) {
            for(int j = matrix[i].length -1; j >= 3; j--){
                if(matrix[i][j] == matrix[i+1][j-1] && matrix[i][j] == matrix[i+2][j-2]
                && matrix[i][j] == matrix[i+3][j-3]){
                    return true;
                }
            }
        }
        return false;
    }
}
