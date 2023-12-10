package week_14.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list size:");
        int size = input.nextInt();

        System.out.print("Enter " + size + " integer for list1:");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
        list1.add(input.nextInt());
        }
        System.out.print("Enter " + size + " integer for list2:");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list2.add(input.nextInt());
        }
        list1.retainAll(list2);
        System.out.println("Intersection of the two list :" + list1);
    }
}
