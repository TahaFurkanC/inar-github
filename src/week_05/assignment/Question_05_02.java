package week_05.assignment;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        int correct = 0;

        for(int i = 1; i<=10; i++){
            int number1 = (int)(Math.random() * 16);
            int number2 = (int)(Math.random() * 16);

            System.out.print("What is " + number1 + " + " + number2 + " ? ");
            int answer = input.nextInt();

            if(answer == number1 + number2) {
                System.out.println("You are correct!");
                correct++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " +
                        number1 + number2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\nCorrect count is " + correct + "\nTest time is " +
                (endTime - startTime) / 1000 + " seconds");
    }
}
