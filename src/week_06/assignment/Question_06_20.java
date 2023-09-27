package week_06.assignment;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        System.out.println("The number of letters in the string \"" + user + "\": "
                + countLetters(user));
    }
    public static int countLetters(String s){
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)))
                counter++;
        }
        return counter;
    }
}
