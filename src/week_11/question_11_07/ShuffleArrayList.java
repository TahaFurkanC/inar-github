package week_11.question_11_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of integers ending with 0:");
        int i = input.nextInt();
        while (i != 0) {
            arr.add(i);
            i = input.nextInt();
        }
        System.out.println("Before shuffling : ");
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
        System.out.println("\nAfter shuffling : ");
        shuffle(arr);
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
