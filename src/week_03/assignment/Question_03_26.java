package week_03.assignment;

import java.util.Scanner;

public class Question_03_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int number = input.nextInt();

        System.out.print("Is divisible by 5 and 6 ? ");
        if(number % 5 == 0 && number % 6 == 0)
            System.out.println(" True");
        else
            System.out.println(" False");

        System.out.print("Is divisible by 5 or 6 ?");
        if(number % 5 == 0 || number % 6 == 0)
            System.out.println(" True");
        else
            System.out.println(" False");

        System.out.print("Is divisible by 5 or 6, but not both ?");
        if(number % 5 == 0 ^ number % 6 == 0)
            System.out.println(" True");
        else
            System.out.println(" False");
    }
}
