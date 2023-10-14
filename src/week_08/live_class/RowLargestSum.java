package week_08.live_class;

import java.util.Scanner;

public class RowLargestSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Enter " + matrix.length * matrix[0].length + " input");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        int maxRow = 0;
        int indexOfMaxRow = 0;

        for(int row = 0; row < matrix.length; row++){
            int totalOfThisRow = 0;
            for(int column = 0; column < matrix[row].length; column++){
                totalOfThisRow += matrix[row][column];
            }
            if(totalOfThisRow > maxRow){
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum : " + maxRow);
    }
}
