package week_11.question_11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoList {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.print("Enter five integers for list1 : ");
        getFromUser(arr1);

        System.out.print("Enter five integers for list2 : ");
        getFromUser(arr2);

        System.out.print("The combined list is :" + union(arr1, arr2));

    }

    public static void getFromUser(ArrayList<Integer> arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }
}
