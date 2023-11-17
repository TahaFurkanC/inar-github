package week_11.question_11_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers ending with 0:");
        int number = input.nextInt();
        while (number != 0) {
            arr.add(number);
            number = input.nextInt();
        }
        System.out.println("The largest number in the list is " +
                max(arr));

    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        }
        return Collections.max(list);
    }
}
