package week_07.assignment;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] list = new int[10];
        for(int i = 0 ; i < list.length; i++){
            list[i] = input.nextInt();
        }
        for(int i = 0; i < list.length; i++){
            for(int j  = 0; j < list.length; j++){
                if(list[i] != list[j])
                    System.out.println(list[i] + " " + list[j]);
            }
        }
    }
}
