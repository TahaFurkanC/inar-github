package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for(int i = 0; i < size1; i++){
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for(int i = 0; i < size2; i++){
            list2[i] = input.nextInt();
        }
        System.out.println("Two lists are " + (equals(list1, list2) ? "identical" : "not identical"));
    }
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length != list2.length)
            return false;
        else{
            int[] newList = new int[list1.length];
            for(int i = 0; i < list1.length; i++){
                for(int j = 0 ; j < list2.length; j++){
                    if(list1[i] == list2[j])
                        newList[i] = list1[i];
                }
            }
            if(Arrays.equals(list1,newList))
                return true;
            else
                return false;
        }
    }
}
