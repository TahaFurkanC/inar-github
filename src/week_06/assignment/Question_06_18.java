package week_06.assignment;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password:");
        String password = input.next();

        System.out.println(isValid(password) ? "Valid Password" : "Invalid Password");
    }
    public static boolean isValid(String password){
        boolean a = true;
        if(password.length() < 8){
            return false;
        }
        for(int i = 0; i < password.length(); i++){
            if(Character.isLetterOrDigit(password.charAt(i)))
            {
                a = true;
            }
            else{
                a = false;
            }
        }
        int counter = 0;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i)))
                counter++;
        }
        if(counter >= 2)
            a = true;
        else
            a = false;
        return a;

    }
}
