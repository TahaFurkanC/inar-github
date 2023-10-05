package week_07.assignment;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten values of double type: ");
        double[] doubleValues = new double[10];
        for(int i = 0; i < doubleValues.length; i ++){
            doubleValues[i] = input.nextDouble();
        }
        System.out.print("The average value: " + average(doubleValues));

    }
    public static int average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
    public static double average(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
}
