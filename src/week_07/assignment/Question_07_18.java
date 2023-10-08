package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(bubbleSort(list)));
    }

    public static double[] bubbleSort(double[] list) {
        double temp;
        for(int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}
