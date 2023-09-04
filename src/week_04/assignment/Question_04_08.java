package week_04.assignment;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code : ");
        int asciiCode = input.nextInt();

        char ch = (char)asciiCode ;

        System.out.println("The character for ASCII code " + asciiCode + " is " + ch);
    }
}
