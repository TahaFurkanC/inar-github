package week_07.live_class;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the items: ");
        int number = input.nextInt();
        double [] myList = new double[number];
        double sum = 0;

        System.out.println("Enter the numbers : ");
        for(int i = 0; i < myList.length;i++){
            myList[i] = input.nextDouble();
            sum += myList[i];
        }

        double average = sum / number;

        int count = 0;
        for(int i = 0; i < number; i++){
            if(myList[i] > average)
                count ++;
        }
        System.out.println("Average is " + average);
        System.out.println("Number of the elements above the average is " + count);
    }
}
