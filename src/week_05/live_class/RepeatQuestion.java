package week_05.live_class;

import java.util.Scanner;

public class RepeatQuestion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        System.out.println("What is " + num1 + "+" + num2);
        int answer = input.nextInt();

        while(answer != (num1 + num2)){
            System.out.println("Wrong answer. Try again ");
            answer = input.nextInt();
        }
        System.out.println("Yes you r right");
    }
}
