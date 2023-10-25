package week_08.assignment;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[][] list1 = new int[3][3];
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        int[][] list2 = new int[3][3];
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = input.nextInt();
            }
        }
        System.out.println("The two array are" + (equals(list1,list2) ? "" : " not") +
                " strictly identical");
    }
    public static boolean equals(int[][] list1,int[][] list2){
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                if(list1[i][j] != list2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
