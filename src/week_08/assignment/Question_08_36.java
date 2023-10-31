package week_08.assignment;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S'};
        System.out.print("Enter number n:");
        int n = input.nextInt();
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        char[][] matrix = new char[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.next().toUpperCase().charAt(0);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if((int)matrix[i][j] > (int)alphabet[n]){
                    System.out.println("Wrong input: the letters must be from A to " + alphabet[n]);
                    System.exit(1);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                for (int k = j+1; k <matrix[i].length; k++) {
                    if(matrix[i][j] == matrix[i][k]){
                        System.out.println("The input array is not a Latin square");
                        System.exit(2);
                    }
                }
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length-1; j++) {
                for (int k = j+1; k < matrix.length; k++) {
                    if(matrix[j][i] == matrix[k][i]){
                        System.out.println("The input array is not a Latin square");
                        System.exit(2);
                    }
                }
            }
        }
        System.out.println("The input array is a Latin square");
    }
}
