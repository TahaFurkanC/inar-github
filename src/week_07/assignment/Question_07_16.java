package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        int[] list = new int[100000];
        for(int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * Integer.MAX_VALUE);
        }
        int key = (int)(Math.random() * Integer.MAX_VALUE);
        estimateTimeForLinearSearch(list, key);
        estimateTimeForBinarySearch(list, key);
    }
    public static void estimateTimeForLinearSearch(int[] list, int key) {
        long startTime = System.currentTimeMillis();
        int a ;
        for(int i = 0; i < list.length; i++){
            if(key == list[i]) {
                a = i;
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("The linear search takes " + executionTime + " milliseconds");
    }
    public static void estimateTimeForBinarySearch(int[] list, int key){
        Arrays.sort(list);
        long startTime = System.currentTimeMillis();
        int a = Arrays.binarySearch(list, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("The binary search takes " + executionTime + " milliseconds");
    }
}
