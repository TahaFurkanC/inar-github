package week_05.assignment;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int lines = input.nextInt();

        for(int i = 1; i <= lines; i++){
            for(int j = lines; j > i; j--)
                System.out.print("  ");
            for(int j = i; j >= 1; j--)
                System.out.print(j + " ");
            for(int j = 2; j <= i; j++)
                System.out.print(j + " ");
            System.out.println(" ");
        }
    }
}
