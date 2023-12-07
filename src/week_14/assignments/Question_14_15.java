package week_14.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements(n):");
        int n = input.nextInt();
        System.out.println("Enter the elements of the ArrayList(each in range [1,n]:");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        
    }
}
