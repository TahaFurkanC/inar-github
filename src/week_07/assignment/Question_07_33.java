package week_07.assignment;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year:");
        int year = input.nextInt();
        String[] zodiac = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake",
        "horse","sheep"};
        System.out.println(year + " is a year of " + zodiac[year % 12] + " in zodiac");
    }
}
