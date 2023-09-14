package week_05.assignment;

import java.util.Scanner;

public class Question_05_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = input.nextInt();

        for(int i = 1; i <= lines; i++){
            for(int j = lines; j > i; j--)
                System.out.printf("%7s" , "");
            for(int j = 1; j <= i; j++)
                System.out.printf("%2d %4s" ,(int)Math.pow(2,(j-1)) , " ");
            for(int j = i - 1; j >= 1; j--)
                System.out.printf("%2d %2s" ,(int)Math.pow(2,(j-1)) , " ");

            System.out.println(" ");
        }
    }
}
