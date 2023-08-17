package week_02.assignment;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT :");
        int gmt = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + gmt) % 24;

        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
