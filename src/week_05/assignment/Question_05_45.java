package week_05.assignment;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        String numbers = "";
        double sum = 0;
        double iPow = 0;
        for(int i = 1; i <= 10; i++) {
            double user = input.nextDouble();
            numbers += user + " ";
            sum += user;
            iPow += Math.pow(user,2);
        }
        System.out.println(numbers);
        double mean = sum / 10;
        double deviation = Math.sqrt((iPow - (Math.pow(sum,2) / 10)) / 9);

        System.out.printf("The mean is %1.2f" , mean);
        System.out.printf("\nThe standard deviation is %1.5f" , deviation);
    }
}
