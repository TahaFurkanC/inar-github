package week_05.assignment;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String user = input.nextLine();

        for(int i = 0; i < user.length(); i = i+2){
            System.out.print(user.charAt(i));
        }
    }
}
