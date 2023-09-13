package week_05.live_class;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final int QUESTIONS = 5 ;
        String output = "";
        int count = 0 ;
        int correctCount = 0 ;
        long startTime = System.currentTimeMillis();

        while(count < QUESTIONS){
            count++;
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            if(num1 < num2){
                int temp = num1 ;
                num1 = num2;
                num2 = temp ;
            }
            System.out.println("What is " + num1 + "-" + num2 + "?");
            int answer = input.nextInt();

            if(answer == (num1 - num2)) {
                System.out.println("Right answer");
                correctCount++;
            }
            else
                System.out.println("Wrong answer");
            output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " Correct" : " Wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime ;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
