package week_06.assignment;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num2 < num1 && num2 < num3){
            double temp = num1;
            num1 = num2;
            num2 =  temp;
        }
        else if(num3 < num1 && num3 < num2){
            double temp = num1;
            num1 = num3;
            num3 = temp;

        }
        if(num2 > num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
