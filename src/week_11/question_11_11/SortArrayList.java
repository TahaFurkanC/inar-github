package week_11.question_11_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0: ");
        int i = input.nextInt();
        while (i != 0) {
            arr.add(i);
            i = input.nextInt();
        }
        System.out.println("Before sorting : ");
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
        sortList(arr);
        System.out.println("\nAfter sorting : ");
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
    }

    public static void sortList(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
