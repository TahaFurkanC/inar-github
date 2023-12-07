package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size 'n' for ArrayList A: ");
        int n1 = input.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        System.out.print("Enter " + n1 + " Integers for ArrayList A:");
        for (int i = 0; i < n1; i++) {
            A.add(input.nextInt());
        }
        Collections.sort(A);
        System.out.println(A);

        System.out.println();

        System.out.print("Enter the size 'n' for ArrayList B: ");
        int n2 = input.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        System.out.print("Enter " + n2 + " Integers for ArrayList B:");
        for (int i = 0; i < n2; i++) {
            B.add(input.nextInt());
        }
        Collections.sort(B);
        Collections.reverse(B);
        System.out.println(B);

        A.addAll(B);
        System.out.println("Merged and sorted ArrayList C:\n" + A);

    }
}
