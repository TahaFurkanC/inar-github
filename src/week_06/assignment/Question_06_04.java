package week_06.assignment;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer to see reversed: ");
        int number = input.nextInt();

        System.out.println("Reversed : ");
        reverse(number);
    }
    public static void reverse(int number){
        String num = number + "";
        String reversed = "";
        for(int i = num.length()-1; i >= 0; i--){
            reversed += num.charAt(i);
        }
        System.out.print(reversed);
    }
}
