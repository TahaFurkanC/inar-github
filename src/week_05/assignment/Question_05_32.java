package week_05.assignment;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        while(number1 == number2)
            number2 = (int) (Math.random() * 10);

        System.out.println("Enter your lottery pick(two distinct digits) : ");
        int userPick = input.nextInt();
        if(userPick > 99 || userPick < 1){
            System.out.println("Wrong input!");
            System.exit(1);
        }
        int userPick1;
        int userPick2;

        if(userPick < 10){
           userPick1 = 0;
           userPick2 = userPick;
        }
        else {
            userPick1 = userPick / 10;
            userPick2 = userPick % 10;
        }

        if(number1 == userPick1 && number2 == userPick2)
            System.out.println("Perfect match! You win $10,000");
        else if (number1 == userPick2 && number2 == userPick1)
            System.out.println("Match all digits: you win $3,000");
        else if(number1 == userPick1 || number1 == userPick2 || number2 == userPick1 || number2 == userPick2)
            System.out.println("Match one digit : you win $1,000");
        else
            System.out.println("Sorry, no match");

        System.out.println("The lottery number is " + number1 + number2);
    }
}
