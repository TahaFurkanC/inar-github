package week_05.assignment;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int userCounter = 0;
        int computerCounter = 0;
        while((userCounter - computerCounter) != 2 && (computerCounter - userCounter) != 2){
            System.out.print("scissor(0), rock(1), paper(2) :");
            int user = input.nextInt();

            int computer = (int)(Math.random() * 3);

            if(user == 0){
                if(computer == 0){
                    System.out.println("You are scissor. Computer is scissor, too. It is a draw");
                }
                else if(computer == 1){
                    System.out.println("You are scissor. Computer is rock. You lose.");
                    computerCounter++;
                }
                else{
                    System.out.println("You are scissor. Computer is paper. You win.");
                    userCounter++;
                }
            }
            else if(user == 1){
                if(computer == 0){
                    System.out.println("You are rock. The computer is scissor. you win.");
                    userCounter++;
                }
                else if(computer == 1){
                    System.out.println("You are rock. The computer is rock,too. it is a draw.");
                }
                else {
                    System.out.println("You are rock. Computer is paper. You lose.");
                    computerCounter++;
                }
            }
            else{
                if(computer == 0){
                    System.out.println("You are paper. Computer is scissor. You lose.");
                    computerCounter++;
                }
                else if(computer == 1){
                    System.out.println("You are paper. Computer is rock. You win.");
                    userCounter++;
                }
                else{
                    System.out.println("You are paper. Computer is paper, too. It is a draw.");
                }
            }

            System.out.println("Computer wins : " + computerCounter);
            System.out.println("User wins : " + userCounter);
        }
    }
}
