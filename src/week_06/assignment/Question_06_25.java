package week_06.assignment;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds : ");
        long milliSeconds = input.nextLong();
        System.out.println("hours:minutes:seconds: " + convertMillis(milliSeconds));
    }
    public static String convertMillis(long millis){
        long totalSeconds = millis / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long hours = totalMinutes / 60;

        return hours + ":" + currentMinute + ":" + currentSeconds;


    }
}
