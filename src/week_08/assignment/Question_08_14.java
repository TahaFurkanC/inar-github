package week_08.assignment;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix:");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        writeIfSameRow(matrix);
        writeIfSameColumn(matrix);
        writeIfSameMajorDiagonal(matrix);
        writeIfSameSubDiagonal(matrix);
    }
    public static void writeIfSameRow(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            boolean isAllSame = true;
            int count = 0;
            for (int j = 0; j < matrix[i].length -1; j++) {
                if(matrix[i][j] != matrix[i][j+1]) {
                    isAllSame = false;
                    break;
                }
            }
            if(isAllSame){
                if(matrix[i][0] == 0)
                    System.out.println("All 0 on row " + i);
                else
                    System.out.println("All 1 on row " + i);
            }
        }
    }
    public static void writeIfSameColumn(int[][] matrix){
        for(int i = 0; i < matrix[0].length; i++){
            boolean isSameColumn = true;
            for (int j = 0; j < matrix.length-1; j++) {
                if (matrix[j][i] != matrix[j+1][i]) {
                    isSameColumn = false;
                    break;
                }
            }
            if(isSameColumn){
                if(matrix[0][i]== 0)
                    System.out.println("All 0 on column " + i);
                else
                    System.out.println("All 1 on column " + i);
            }
        }
    }
    public static void writeIfSameMajorDiagonal(int[][] matrix){
        boolean isSameMajorDiagonal = true;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][i] != matrix[j][j])
                    isSameMajorDiagonal = false;
                }
            }
        if(isSameMajorDiagonal){
            if(matrix[0][0] == 0)
                System.out.println("Major diagonal is all with 0");
            else
                System.out.println("Major diagonal is all with 1");
        }
    }
    public static void writeIfSameSubDiagonal(int[][] matrix){
        boolean isSubDiagonalSame = true;
        for (int i = 0,j = matrix[0].length -1; i < matrix.length -1; i++,j--) {
                if(matrix[i][j] != matrix[i+1][j-1]){
                    isSubDiagonalSame =false;
            }
        }
        if(isSubDiagonalSame){
            if(matrix[0][matrix.length-1] == 0)
                System.out.println("All 0 on sub-diagonal");
            else
                System.out.println("All 1 on sub-diagonal");
        }
    }
}
