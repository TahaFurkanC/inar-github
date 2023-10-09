package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] list = new double[10];
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(greatSelectionSort(list)));
    }
    public static double[] greatSelectionSort(double[] list){
        double currentMax = -1;

        for(int i = list.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(list[j] > list[i]){
                    currentMax = list[j];
                    list[j] = list[i];
                    list[i] = currentMax;
                }
            }
        }
        return list;
    }
}
