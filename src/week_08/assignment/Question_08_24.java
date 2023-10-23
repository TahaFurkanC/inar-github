package week_08.assignment;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sudoku solution");
        int[][] grid = new int[9][9];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = input.nextInt();
                if(grid[i][j] < 1 || grid[i][j] > 9){
                    System.out.println("invalid input!");
                    System.exit(1);
                }
            }
        }
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }
    public static boolean isValid(int[][] grid){
       return isValidRow(grid) && isValidColumn(grid) && isValidBox(grid);
    }
    public static boolean isValidRow(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                for (int k = 0; k < grid[i].length; k++) {
                    if(k != j && grid[i][j] == grid[i][k]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean isValidColumn(int[][] grid){
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                for (int k = 0; k < grid.length; k++) {
                    if(j != k && grid[j][i] == grid[k][i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean isValidBox(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
                    for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                        if(row != i && col != j && grid[row][col] == grid[i][j]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
