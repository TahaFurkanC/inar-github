package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }
        System.out.println("The merged list is: " + Arrays.toString(merge(list1, list2)));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] sortedList = new int[list1.length + list2.length];
        for (int i = 0; i < sortedList.length; i++) {
            if (i < list1.length) {
                sortedList[i] = list1[i];
            } else
                sortedList[i] = list2[i - list1.length];
        }

        for (int i = 0; i < sortedList.length; i++) {
            for (int j = i + 1; j < sortedList.length; j++) {
                if (sortedList[i] > sortedList[j]) {
                    int temp = sortedList[i];
                    sortedList[i] = sortedList[j];
                    sortedList[j] = temp;
                }
            }
        }
        return sortedList;
    }
}
