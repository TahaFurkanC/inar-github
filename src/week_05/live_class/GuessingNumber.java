package week_05.live_class;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 100);

        System.out.println("Make a guess between 0-100");
        int answer = input.nextInt();

        while(answer != number){
            if(answer > number) {
                System.out.println("Your guess is high");
                answer = input.nextInt();
            }
            else {
                System.out.println("Your guess is low");
                answer = input.nextInt();
            }
        }
        System.out.println("You found!");
    }
}
