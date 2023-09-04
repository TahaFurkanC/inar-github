package week_04.assignment;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String user = input.nextLine();

        System.out.println("Length of the string : " + user.length());
        System.out.println("First character of the string : " + user.charAt(0));
    }
}
