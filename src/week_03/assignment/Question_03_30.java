package week_03.assignment;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT : ");
        int gmt = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000 ;
        long currentSecond = totalSeconds % 60 ;
        long totalMinutes = totalSeconds / 60 ;
        long currentMinute = totalMinutes % 60 ;
        long totalHours = totalMinutes / 60 ;
        long currentHour = (totalHours + gmt) % 24 ;



        if(currentHour > 12)
            System.out.println("The current time is " + (currentHour % 12) + " : " + currentMinute + " : " + currentSecond + " PM");
        else
            System.out.println("The current time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " AM");
    }
}
