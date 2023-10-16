package week_08.assignment;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1:");
        double[][] matrix1 = new double[3][3];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2:");
        double[][] matrix2 = new double[3][3];
        for(int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = input.nextDouble();
            }
        }
        double[][] multiplied = multiplyMatrix(matrix1,matrix2);
        System.out.println("The multiplication of the matrices is ");
        for(int i = 0; i < multiplied.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                System.out.print(matrix1[i][j] + " ");
                if(i == 1 && j == 2)
                    System.out.print("  *  ");
                else if (i != 1 && j == 2)
                    System.out.print("     ");
                else
                    System.out.print(" ");
            }
            for(int k = 0; k < matrix2[i].length; k++){
                System.out.print(matrix2[i][k] + " ");
                if(i == 1 && k == 2)
                    System.out.print("  =  ");
                else if (i != 1 && k == 2)
                    System.out.print("     ");
                else
                    System.out.print(" ");
            }
            for(int l = 0; l < multiplied[i].length; l++){
                System.out.print(multiplied[i][l] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] multiplyMatrix(double[][]a,double[][]b){
        double[][] result = new double[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int z = 0; z < a.length; z++) {

                    result[i][j] += a[i][z] * b[z][j];
                }
            }
        }
        return result;
    }
}
