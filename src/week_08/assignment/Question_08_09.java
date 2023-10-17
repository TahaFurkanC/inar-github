package week_08.assignment;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {

        String[][] array = new String[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = " ";
            }
        }
        boolean isGameOver = false;

        int whoseTurn = 0; // mod0 for X, mod1 for 0
        while (!isGameOver) {

            displayTable(array);
            placeGamerChoice(array, whoseTurn);

            if (isWin(array, whoseTurn)) {
                isGameOver = true;
                System.out.println((whoseTurn % 2 == 0 ? "X" : "O") + " player won");
            } else if (isDraw(array)) {
                isGameOver = true;
                System.out.println("Its draw.Play again!!");
            }
            whoseTurn++;

        }
    }


    public static void placeGamerChoice(String[][] array, int whoseTurn) {
        Scanner input = new Scanner(System.in);
        String token = (whoseTurn % 2 == 0 ? "X" : "O");

        System.out.print("Enter a row (0, 1, or 2) for player " + (whoseTurn % 2 == 0 ? "X: " : "O: "));
        int row = input.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player " + (whoseTurn % 2 == 0 ? "X: " : "O: "));
        int col = input.nextInt();

        array[row][col] = token;
    }


    public static void displayTable(String[][] m) {
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("| " + m[i][j] + " ");
            }
            System.out.println("|\n-------------");
        }
    }

    public static boolean isWin(String[][] array, int whoseTurn) {
        String token = (whoseTurn % 2 == 0 ? "X" : "O");
        return (checkRow(array, token) || checkColumn(array, token) || checkDiagonal(array, token));
    }

    public static boolean checkRow(String[][] array, String token) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {

                if (array[i][j] == token) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumn(String[][] array, String token) {
        for (int j = 0; j < array.length; j++) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {

                if (array[i][j] == token) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal(String[][] array, String token) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] == token) {
                count++;
            }
        }
        if (count == 3) {
            return true;
        }

        count = 0;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (array[i][j] == token) {
                count++;
            }
        }
        if (count == 3) {
            return true;
        }
        return false;
    }

    public static boolean isDraw(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == " ") {
                    return false;
                }
            }
        }
        return true;
    }
}
