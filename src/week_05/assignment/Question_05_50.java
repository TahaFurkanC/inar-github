package week_05.assignment;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String user = input.nextLine();
        int counter = 0;
        for(int i = 0; i < user.length(); i++){
            if(user.charAt(i) >= 'A' && user.charAt(i) <= 'Z')
                counter ++;
        }
        System.out.println("The number of uppercase letters is : " + counter);
    }
}
