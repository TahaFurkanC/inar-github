package week_08.assignment;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] capitals = {{"Turkey","Ankara"},{"Greece", "Athens"}, {"Italy", "Rome"}, {"England", "London"}, {"Germany", "Berlin"}};

        int count = 0;
        for (int i = 0; i < capitals.length; i++) {
            System.out.println("What is the capital of " + capitals[i][0]);
            String answer = input.next();
            if(answer.equalsIgnoreCase(capitals[i][1])){
                System.out.println("Your answer is correct");
                count++;
            }
            else
                System.out.println("The correct answer should be " + capitals[i][1]);
        }
        System.out.println("The correct count is " + count);
    }
}
