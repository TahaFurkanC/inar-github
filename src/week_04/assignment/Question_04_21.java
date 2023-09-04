package week_04.assignment;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN in format DDD-DD-DDDD : ");
        String user = input.nextLine();

        int first = user.indexOf('-');
        int second = user.lastIndexOf('-');

        if(first ==3 && second == 6 && user.length() == 11 && Character.isDigit(user.charAt(0)) &&
        Character.isDigit(user.charAt(1)) && Character.isDigit(user.charAt(2)) &&
                Character.isDigit(user.charAt(4)) && Character.isDigit(user.charAt(5)) &&
                Character.isDigit(user.charAt(7)) && Character.isDigit(user.charAt(8)) &&
                Character.isDigit(user.charAt(9)) && Character.isDigit(user.charAt(10)))
            System.out.println(user + " is a valid social security number");
        else
            System.out.println(user + " is an invalid social security number");
    }
}
