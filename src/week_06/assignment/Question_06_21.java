package week_06.assignment;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine().toUpperCase();

        for(int i = 0; i < user.length(); i++){
            if(user.charAt(i) >= 'A' && user.charAt(i) <= 'Z'){
                System.out.print(getNumber(user.charAt(i)));
            }
            else
                System.out.print(user.charAt(i));
        }
    }
    public static int getNumber(char ch){
        if(ch >= 'W')
            return 9;
        else if (ch >= 'T')
            return 8;
        else if (ch >= 'P')
            return 7;
        else if (ch >= 'M')
            return 6;
        else if (ch >= 'J')
            return 5;
        else if (ch >= 'G')
            return 4;
        else if (ch >= 'D')
            return 3;
        else
            return 2;
    }
}
