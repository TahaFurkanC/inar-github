package week_05.assignment;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year : ");
        int day = input.nextInt();

        String header = "";

        for(int month = 1; month <= 12; month++){
            header = "";
            switch(month){
                case 1 : header += "January " + year;break;
                case 2 : header += "February " + year;break;
                case 3 : header += "March " + year;break;
                case 4 : header += "April " + year;break;
                case 5 : header += "May " + year;break;
                case 6 : header += "June " + year;break;
                case 7 : header += "July " + year;break;
                case 8 : header += "August " + year;break;
                case 9 : header += "September " + year;break;
                case 10 : header += "October " + year;break;
                case 11 : header += "November " + year;break;
                case 12 : header += "December " + year;break;
            }
            System.out.println(header + "\n---------------------------------------\n" +
                    "\"Sun    Mon    Tue    Wed    Thu    Fri    Sat\"");

            day %= 7;

            for (int b = 0; b <= day * 7; b++) {
                System.out.print(" ");
            }

            int lastDay = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                lastDay += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                lastDay += 30;
            else { // Test for leap year
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    lastDay += 29;
                else
                    lastDay += 28;
            }

            for (int d = 1; d <= lastDay; d++) {
                if(d < 10)
                    System.out.print(" ");

                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "     ");
                    // After last day of the month go to new line
                    if (d == lastDay)
                        System.out.println();
                }
                day++; // increment day
            }
            System.out.println();
        }
    }
}
