package week_11.question_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
    public static void main(String[] args) {

        ArrayList<Double> arr = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        double i = input.nextInt();
        int count = 0;
        while (i != 0 && count < 4) {
            arr.add(i);
            i = input.nextInt();
            count++;
        }
        System.out.print("Sum of list : " + sum(arr));

    }

    public static double sum(ArrayList<Double> list){
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i);
        }
        return d;
    }
}
