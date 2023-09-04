package week_04.assignment;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter to learn is that a vowel or consonant :");
        String letter = input.next().toUpperCase();
        char ch = letter.charAt(0);

        if(Character.isLetter(ch) && letter.length() == 1) {
            String vowel = "AEIOÖUÜ";

            if (vowel.contains(letter)) {
                System.out.println(letter + " is a vowel");
            } else
                System.out.println(letter + " is a consonant");

        }
        else
            System.out.println("Invalid input!");
    }
}
