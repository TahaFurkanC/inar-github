package week_02.assignment;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double birth = 365.0 * 24 * 60 * 60 / 7;
        double death = 365.0 * 24 * 60 * 60 / 13;
        double immigrant = 365.0 * 24 * 60 * 60 / 45;
        double change_per_year = birth + immigrant - death;
        double current_population = 312032486;

        System.out.println("Enter the number of years : ");
        int years = input.nextInt();

        System.out.println("The population in 5 years is " + (current_population +
                (years * change_per_year)));
    }
}
