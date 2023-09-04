package week_04.assignment;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name : ");
        String name = input.next();

        System.out.println("Enter number of hours worked in a week : ");
        int hours = input.nextInt();

        System.out.println("Enter hourly pay rate : ");
        double rate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate : ");
        double federalTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate : ");
        double stateTax = input.nextDouble();

        System.out.println("Employee Name: " + name + "\nHours Worked: " + hours + "\n" +
                "Pay Rate: $" + rate + "\nGross Pay: $" + (hours * rate) + "\n" +
                "Deductions :\n\tFederal Withholding (" + (federalTax * 100.0) + "%) : $" + (hours * rate * federalTax) +
                "\n\tState Withholding (" + (stateTax *100.0) + "%) : $" + (hours * rate * stateTax) +
                "\n\tTotal Deduction : $" + ((hours * rate * federalTax) + (hours * rate * stateTax)) +
                "\nNet Pay : $" + ((hours* rate) - (((hours * rate* federalTax) + (hours * rate * stateTax)))));
    }
}
