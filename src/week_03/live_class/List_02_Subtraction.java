package week_03.live_class;

import java.util.Scanner;

public class List_02_Subtraction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if(number2 > number1){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is " + number1 + " - " + number2 + "?");
        int answer = input.nextInt();

        if(answer == number1 - number2)
            System.out.println("Yes, u r right");
        else {
            System.out.println("U r wrong, " + number1 + " - " + number2 + " should be " +
                    (number1 - number2));
        }
    }
}
