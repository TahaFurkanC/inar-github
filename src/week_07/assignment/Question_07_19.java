package week_07.assignment;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for(int i = 0; i < size; i++){
            list[i] = input.nextInt();
        }
        System.out.println("The list is " + (isSorted(list) ? "already sorted" : "not sorted"));
    }
    public static boolean isSorted(int[] list){
        boolean result = true;
        for(int i = 0; i < list.length; i++){
            for(int j = i + 1; j < list.length; j++){
                if(list[i] > list[j])
                    result = false;
            }
        }
        return result;
    }
}
