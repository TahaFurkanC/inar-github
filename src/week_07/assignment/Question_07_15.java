package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int[] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(distinctNumber(array)));
    }

    public static int[] distinctNumber(int[] array) {
        int[] result = new int[array.length];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (array[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                result[count] = array[i];
                count++;
            }
        }
        int[] lastResult = new int[count];
        for (int i = 0; i < count; i++) {
            lastResult[i] = result[i];
        }
        return lastResult;
    }
}
