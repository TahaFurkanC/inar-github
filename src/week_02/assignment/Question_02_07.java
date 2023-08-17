package week_02.assignment;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes : ");
        int min = input.nextInt();
        int year = min/60/24/365;
        int day = (min/60/24)%365;

        System.out.println(min + " minutes is approximetly " + year +
                " years and " + day + " days");
    }
}
