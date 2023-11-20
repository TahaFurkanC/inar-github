package week_11.question_11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        ArrayList<Integer> answers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");

        answers.add(input.nextInt());
        int a = 0;
        while (number1 + number2 != answers.get(a)) {
            for (int i = 0; i < answers.size()-1; i++) {
                for (int j = i + 1; j < answers.size() ; j++) {
                    if (i != j && answers.get(i) == answers.get(j)) {
                        System.out.println("You already entered " + answers.get(i));
                        break;
                    }
                }
            }
            a++;
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?");
            answers.add(input.nextInt());
        }
        System.out.println("You got it!");
    }
}
