package week_05.assignment;

import java.util.Scanner;

public class Question_05_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = input.nextInt();

        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println(" ");

        }
        System.out.println("----------------------------------------");

        for(int i = lines; i >= 1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println(" ");
        }
        System.out.println("----------------------------------------");

        for(int i = 1; i <= lines; i++){
            for(int j = lines; j >= i; j--)
                System.out.printf("%2s", "");
            for(int j = i; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println(" ");
        }
        System.out.println("----------------------------------------");

        for(int i = lines; i >= 1; i--) {
            for (int j = lines; j > i; j--)
                System.out.printf("%2s", "");
            for (int j = 1; j <= i; j++)
                System.out.printf("%2d" , j);
            System.out.println("");
        }
    }
}
