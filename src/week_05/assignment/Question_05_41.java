package week_05.assignment;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (it ends with input of 0) : ");
        int user = input.nextInt();
        int max = 0;
        int count = 0;
        String numbers = "";

        while(user != 0){
            numbers += user + " ";
            if(user > max) {
                max = user;
                count = 1;
            }
            else if(user == max)
                count ++;

            user = input.nextInt();
        }
        System.out.println(numbers);
        System.out.println("The largest count " + max + " and the occurrence of the count is " + count);
    }
}
