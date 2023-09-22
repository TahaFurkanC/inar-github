package week_06.assignment;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        System.out.println(number + " is " + (isPalindrome(number) ? " a palindrome."
                : " not a palindrome." ));
    }
    public static boolean isPalindrome(int number){
        if(reverse(number) == number)
            return true;
        else
            return false;
    }
    public static int reverse(int number){
        String num = number + "";
        String reversed = "";
        for(int i = num.length()-1; i >= 0; i --){
            reversed += num.charAt(i);
        }
        return Integer.parseInt(reversed);

    }
}
