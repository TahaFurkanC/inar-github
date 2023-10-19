package week_08.assignment;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] matrix = new char[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = ' ';
            }
        }

        int count = 0;

        printTable(matrix);

        do{
            int row;
            int column;

            if(count % 2 == 0){
                System.out.print("Enter a row (0, 1, 2) for X player : ");
                row = input.nextInt();

                System.out.print("Enter a column(0, 1, 2) for X player : ");
                column = input.nextInt();

            }else{

                System.out.print("Enter a row (0, 1, 2) for O player : ");
                row = input.nextInt();

                System.out.print("Enter a column(0, 1, 2) for O player : ");
                column = input.nextInt();

            }

            if(matrix[row][column] == ' '){
                if(count % 2 == 0){
                    matrix[row][column] = 'X';
                }else{
                    matrix[row][column] = 'O';
                }

                count++;
            }

            printTable(matrix);

        }while(!isWin(matrix) && count <= 9);

        if(isWin(matrix)){
            if(count % 2 != 0){
                System.out.println("X player win");
            }else{
                System.out.println("O player win");
            }
        }else{
            System.out.println("Nobody wins");
        }


    }

    public static boolean isWin(char[][] matrix) {
        return isWinRow(matrix) || isWinColumn(matrix) || isWinDiagonal(matrix);
    }

    public static boolean isWinDiagonal(char[][] matrix) {
        return isWinDiagonalFromLeft(matrix) || isWinDiagonalFromRight(matrix);
    }

    public static boolean isWinDiagonalFromRight(char[][] matrix) {
        boolean st = false;
        for (int i = 1, j = 1; i < matrix.length; i++, j--) {
            st = true;
            if(matrix[i][j] == ' ' || matrix[0][2] != matrix[i][j]){
                st = false;
                break;
            }
        }

        return st;
    }

    public static boolean isWinDiagonalFromLeft(char[][] matrix) {
        boolean st = false;
        for (int i = 1; i < matrix.length; i++) {
            st = true;
            if(matrix[i][i] == ' ' || matrix[0][0] != matrix[i][i]){
                st = false;
                break;
            }
        }

        return st;
    }

    public static boolean isWinRow(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean st = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] == ' ' || matrix[i][0] != matrix[i][j]){
                    st = false;
                    break;
                }
            }
            if(st){
                return st;
            }
        }

        return false;
    }

    public static boolean isWinColumn(char[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            boolean st = true;
            for (int j = 1; j < matrix.length; j++) {
                if(matrix[j][i] == ' ' || matrix[0][i] != matrix[j][i]){
                    st = false;
                    break;
                }
            }
            if(st){
                return st;
            }
        }

        return false;
    }



    public static void printTable(char[][] matrix) {
        System.out.println("--------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("--------------");
        }
    }
}
