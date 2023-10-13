package week_07.assignment;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values:");
        int numberOfValues = input.nextInt();
        System.out.print("Enter the values: ");
        int[] values = new int[numberOfValues];
        for(int i = 0; i < numberOfValues; i++){
            values[i] = input.nextInt();
        }
        System.out.println("The list has " + (isConsecutiveFour(values) ? "consecutive fours"
                : "no consecutive fours"));
    }
    public static boolean isConsecutiveFour(int[] values){
        for(int i = 0; i < values.length -3; i++){
            if((values[i] == values[i + 1]) && (values[i] == values[i + 2]) &&
                    (values[i] == values[i + 3]))
                return true;
        }
        return false;
    }
}
