package week_06.assignment;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++)
                System.out.print((int)(Math.random() * 2) + "  ");
            System.out.println();
        }
    }
}
