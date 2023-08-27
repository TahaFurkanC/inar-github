package week_03.assignment;

import java.util.Scanner;
public class Question_03_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int computer = (int)(Math.random() * 3);

        System.out.println("scissor (0), rock (1), paper(2) : ");
        int user = input.nextInt();

        if(user >= 3 || user < 0) {
            System.out.println("invalid input");
            System.exit(1);
        }

        if(user == 0){
            if(computer == 0)
                System.out.println("You are scissor. The computer is scissor too. It is a draw.");
            else if(computer == 1)
                System.out.println("You are scissor. The computer is rock. Computer win.");
            else
                System.out.println("You are scissor. The computer is paper. You win!");
        }
        if(user == 1){
            if(computer == 0)
                System.out.println("You are rock. The computer is scissor. You win!");
            else if(computer == 1)
                System.out.println("You are rock. The computer is rock . It is a draw.");
            else
                System.out.println("You are rock. The computer is paper. Computer win.");
        }
        if(user == 2){
            if(computer == 0)
                System.out.println("You are paper. The computer is scissor. Computer win!");
            else if(computer == 1)
                System.out.println("You are paper. The computer is rock. You win!");
            else
                System.out.println("You are paper. The computer is paper. It is a draw.");
        }
    }
}
