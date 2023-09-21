package week_05.assignment;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String user1 = input.nextLine();
        System.out.println("Enter second string : ");
        String user2 = input.nextLine();

        int i = 0;
        String prefix = "";
        while(user1.charAt(i) == user2.charAt(i)){
            prefix += user1.charAt(i);
            i++;
        }
        if(prefix.length() != 0)
            System.out.println("The common prefix is : " + prefix);
        else
            System.out.println(user1 + " and " + user2 + " have no common prefix");
    }
}
