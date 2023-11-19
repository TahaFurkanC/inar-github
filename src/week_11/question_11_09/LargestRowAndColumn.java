package week_11.question_11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowAndColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size:");
        int size = input.nextInt();

        int[][] arr = fillMatrix(size);

        printMatrix(arr);

        ArrayList<Integer> row = largestRow(arr);
        System.out.print("The largest row index: " + row);

        ArrayList<Integer> column = largestColumn(arr);
        System.out.println("\nThe largest column index: " + column);

    }

    public static int[][] fillMatrix(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> largestRow(int[][] arr) {
        ArrayList<Integer> maxRowList = new ArrayList<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                maxRowList.clear();
                maxRowList.add(i);
            } else if (max == count) {
                maxRowList.add(i);
            }
        }
        return maxRowList;
    }

    public static ArrayList<Integer> largestColumn(int[][] arr) {
        ArrayList<Integer> maxColumnList = new ArrayList<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr[0].length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 1) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                maxColumnList.clear();
                maxColumnList.add(i);
            } else if (max == count) {
                maxColumnList.add(i);
            }
        }
        return maxColumnList;
    }
}
