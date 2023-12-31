package week_05.assignment;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : (e.g. , 2012) :");
        int year = input.nextInt();
        System.out.print("Enter first day of the year : ");
        int day = input.nextInt();

        String output = "";

        for (int month = 1; month <= 12; month++) {
            output = "";

            switch (month) {
                case 1:
                    output += "January 1 , " + year + " is ";
                    break;
                case 2:
                    output += "February 1 , " + year + " is ";
                    break;
                case 3:
                    output += "March 1 , " + year + " is ";
                    break;
                case 4:
                    output += "April 1 , " + year + " is ";
                    break;
                case 5:
                    output += "May 1 , " + year + " is ";
                    break;
                case 6:
                    output += "June 1 , " + year + " is ";
                    break;
                case 7:
                    output += "July 1 , " + year + " is ";
                    break;
                case 8:
                    output += "August 1 , " + year + " is ";
                    break;
                case 9:
                    output += "September 1 , " + year + " is ";
                    break;
                case 10:
                    output += "October 1 , " + year + " is ";
                    break;
                case 11:
                    output += "November 1 , " + year + " is ";
                    break;
                case 12:
                    output += "December 1 , " + year + " is ";
                    break;
            }
            day %= 7;

            switch (day) {
                case 0:
                    System.out.println(output + "Sunday");
                    break;
                case 1:
                    System.out.println(output + "Monday");
                    break;
                case 2:
                    System.out.println(output + "Tuesday");
                    break;
                case 3:
                    System.out.println(output + "Wednesday");
                    break;
                case 4:
                    System.out.println(output + "Thursday");
                    break;
                case 5:
                    System.out.println(output + "Friday");
                    break;
                case 6:
                    System.out.println(output + "Saturday");
                    break;
            }

            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                day += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                day += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    day += 29;
                else
                    day += 28;
            }
        }
    }
}