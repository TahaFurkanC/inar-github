package week_03.assignment;

import java.util.Scanner;
public class Question_03_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today´s day : ");
        int today = input.nextInt();

        System.out.println("Enter the number of days elapsed since today : ");
        int elapsedDay = input.nextInt();

        int futureDay = (today + elapsedDay) % 7 ;

        System.out.print("Today is ");
        switch(today){
            case 0 : System.out.print("Sunday ");break;
            case 1 : System.out.print("Monday ");break;
            case 2 : System.out.print("Tuesday ");break;
            case 3 : System.out.print("Wednesday ");break;
            case 4 : System.out.print("Thursday ");break;
            case 5 : System.out.print("Friday ");break;
            case 6 : System.out.print("Saturday ");break;
            default : System.out.print("invalid input "); System.exit(1);
        }

        System.out.print("and the future day is ");
        switch(futureDay){
            case 0 : System.out.print("Sunday ");break;
            case 1 : System.out.print("Monday ");break;
            case 2 : System.out.print("Tuesday ");break;
            case 3 : System.out.print("Wednesday ");break;
            case 4 : System.out.print("Thursday ");break;
            case 5 : System.out.print("Friday ");break;
            case 6 : System.out.print("Saturday ");break;
        }

    }
}
