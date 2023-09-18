package week_05.assignment;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String user = input.next();
        String reversed = "";

        for(int i = user.length() - 1; i >= 0; i--){
            reversed += user.charAt(i);
        }
        System.out.println("The reverse string is " + reversed);
    }
}
