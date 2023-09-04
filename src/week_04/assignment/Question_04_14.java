package week_04.assignment;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade");
        String letter = input.next().toUpperCase();
        int letterValue = letter.charAt(0);
        int value1 = 'A';
        int value2 = 'F';

        if (letterValue < value1 || letterValue > value2 || letterValue == value2 - 1)
            System.out.println(letter + " is an invalid grade");
        else
            switch(letter) {
                case "A": System.out.println("The numeric value for grade A is 4");break;
                case "B": System.out.println("The numeric value for grade B is 3");break;
                case "C": System.out.println("The numeric value for grade C is 2");break;
                case "D": System.out.println("The numeric value for grade D is 1");break;
                case "F": System.out.println("The numeric value for grade F is 0");break;
            }

    }
}
