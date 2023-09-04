package week_04.assignment;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter : ");
        String letter = input.next().toUpperCase();

        if("ABC".contains(letter))
            System.out.println("The corresponding number is 2");
        else if("DEF".contains(letter))
            System.out.println("The corresponding number is 3");
        else if("GHI".contains(letter))
            System.out.println("The corresponding number is 4");
        else if("JKL".contains(letter))
            System.out.println("The corresponding number is 5");
        else if("MNO".contains(letter))
            System.out.println("The corresponding number is 6");
        else if("PQRS".contains(letter))
            System.out.println("The corresponding number is 7");
        else if("TUV".contains(letter))
            System.out.println("The corresponding number is 8");
        else if("WXYZ".contains(letter))
            System.out.println("The corresponding number is 9");
    }
}
