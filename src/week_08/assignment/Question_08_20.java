package week_08.assignment;

import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {

        char[][] board = new char[6][7];
        fillBoard(board, ' ');

        boolean isGameOver = false;
        int whoseTurn = 0; // mod0 for R, mod1 for Y
        while (!isGameOver) {

            displayBoard(board);
            placeGamerChoice(board, whoseTurn);

            if (isWin(board, whoseTurn)) {
                isGameOver = true;
                System.out.println((whoseTurn % 2 == 0 ? "Red" : "Yellow") + " player won!!!!");
            } else if (isDraw(board)) {
                isGameOver = true;
                System.out.println("Its draw.Play again!!");
            }
            whoseTurn++;
        }
        displayBoard(board);
    }

    public static void fillBoard(char[][] board, char c) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = c;
            }
        }
    }

    public static void displayBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("|" + board[row][col]);
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }

    public static void placeGamerChoice(char[][] board, int whoseTurn) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Drop a" + ((whoseTurn % 2 == 0) ? " red " : " yellow ") + "disk at column (0-6): ");
            int col = input.nextInt();

            if (col < 0 || board[0].length <= col) {
                System.out.println("Invalid column!");
                continue;
            }

            for (int row = board.length - 1; row >= 0; row--) {
                if (board[row][col] == ' ') {
                    board[row][col] = (whoseTurn % 2 == 0) ? 'R' : 'Y';
                    return;
                }
            }
            System.out.println("Column " + col + " is full!");
        }
    }

    public static boolean isWin(char[][] array, int whoseTurn) {
        char token = (whoseTurn % 2 == 0 ? 'R' : 'Y');
        return (checkRow(array, token) || checkColumn(array, token) || checkDiagonal(array, token));
    }

    public static boolean checkRow(char[][] array, char token) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == token) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean checkColumn(char[][] array, char token) {
        for (int j = 0; j < array[0].length; j++) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {

                if (array[i][j] == token) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean checkDiagonal(char[][] table, char token) {
        if (checkRightDiagonal(table, token)) {
            return true;
        }
        if (checkLeftDiagonal(table, token)) {
            return true;
        }
        return false;
    }

    public static boolean checkRightDiagonal(char[][] table, char token) {
        for (int row = table.length - 1; row >= 3; row--) {
            for (int column = 0; column <= table[0].length - 4; column++) {
                int count = 0;
                for (int i = row, j = column; i >= row - 3; i--, j++) {
                    if (table[i][j] == token) {
                        count++;
                    }
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkLeftDiagonal(char[][] table, char token) {
        for (int row = table.length - 1; row >= 3; row--) {
            for (int column = table[0].length - 1; column >= 3; column--) {
                int count = 0;
                for (int i = row, j = column; i >= row - 3; i--, j--) {
                    if (table[i][j] == token) {
                        count++;
                    } else {
                        count = 0;
                    }
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
