package week_06.assignment;

import java.util.Scanner;

public class Question_06_33 {
    static int daysElapsedCurrentYear;
    static int getDaysElapsedCurrentMonth;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the gmt: ");
        int gmt = input.nextInt();
        System.out.print("Current time and date is: ");

        long totalMilliSeconds = System.currentTimeMillis();
        System.out.print(currentTime(totalMilliSeconds,gmt) + "  ");

        System.out.print(getCurrentDate(totalMilliSeconds));

    }
    public static String currentTime(long totalMilliSeconds, int gmt){
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60 ;
        long currentHour = (totalHours + gmt) % 24;

        return currentHour + ":" + currentMinute + ":"+ currentSecond;


    }

    public static String getCurrentDate(long millis) {
        long seconds = millis / 1000;
        long min = seconds / 60;
        long hours = min / 60;
        long days = hours / 24;
        int year = getYear((int) days);
        int month = getCurrentMonth(year, daysElapsedCurrentYear);
        return month + "/" + getDaysElapsedCurrentMonth + "/" + year;
    }
    public static int getYear(int totalDays) {
        int year = 1970;
        while (totalDays > 365) {
            totalDays -= numberOfDaysInAYear(year);
            year++;
            daysElapsedCurrentYear = totalDays;
        }
        return year;
    }
    public static int numberOfDaysInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getCurrentMonth(int year, int daysElapsedInYear) {
        int month = 0;
        while (daysElapsedInYear > 0) {
            month++;
            getDaysElapsedCurrentMonth = daysElapsedInYear;
            daysElapsedInYear -= getNumberOfDaysInMonth(year, month);

        }
        return month;

    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }
}
