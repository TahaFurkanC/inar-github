package week_07.assignment;

import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1:");
        int size = input.nextInt();
        int[] list1 = new int[size];
        for (int i = 0; i < size; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }
        System.out.println("Two lists are " + (equals(list1, list2) ? "strictly identical"
                : "not strictly identical"));
    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean result = true;
        if (list1.length != list2.length)
            result = false;
        else {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
