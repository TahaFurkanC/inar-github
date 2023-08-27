package week_03.assignment;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = (int)(Math.random() * 2) ;
        System.out.println(num);
        System.out.println("Guess the flip of coin (0 represents head and 1 represents tail) :" );
        int user = input.nextInt();

        if(num == user)
            System.out.println("Your guess is correct");
        else
            System.out.println("Your guess is incorrect");
    }
}
