package week_11.question_11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_LIST = 10;

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter ten integers : ");
        for (int i = 0; i < NUMBER_OF_LIST; i++) {
            arr.add(input.nextInt());
        }
        removeDuplicate(arr);
        System.out.print("The distinct integers are : ");
        for (Integer elements : arr) {
            System.out.print(elements + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
