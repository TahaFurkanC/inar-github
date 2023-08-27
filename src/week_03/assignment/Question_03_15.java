package week_03.assignment;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int lotteryNumber = (int)(Math.random() * 900) + 100 ;
        int tempNumber = lotteryNumber ;

        int t3 = tempNumber % 10 ;
        tempNumber /= 10 ;
        int t2 = tempNumber % 10 ;
        int t1 = tempNumber / 10 ;

        System.out.println("Enter your lottery pick (three digits) : ");
        int user = input.nextInt();
        int number = user ;

        int d3 = number % 10 ;
        number /= 10 ;
        int d2 = number % 10 ;
        int d1 = number / 10 ;

        if(lotteryNumber == user)
            System.out.println("The lottery number is " + lotteryNumber + "\nYou win 10,000$");
        else if((t1 == d1 || t1 == d2 || t1 == d3) && (t2 == d1 || t2 == d2 || t2 == d3) && (t3 == d1 || t3 ==d2 || t3 == d3))
            System.out.println("The lottery number is " + lotteryNumber + "\nYou win 3,000$");
        else if((t1 == d1 || t1 == d2 || t1 == d3) || (t2 == d1 || t2 == d2 || t2 == d3) || (t3 == d1 || t3 ==d2 || t3 == d3))
            System.out.println("The lottery number is " + lotteryNumber + "\nYou win 1,000$");
        else
            System.out.println("Sorry no matched number :(");
    }
}
