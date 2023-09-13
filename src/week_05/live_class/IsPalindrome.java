package week_05.live_class;

import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String user = input.next();

        int left = 0;
        int right = user.length() - 1;

        boolean check = true;

        while (left < right) {
            if (user.charAt(left) != user.charAt(right)) {
                check = false;
                System.out.println("It is not a palindrome");
                System.exit(1);

            }
            left++;
            right--;
        }
        if (check)
            System.out.println("It is a palindrome");
    }
}
