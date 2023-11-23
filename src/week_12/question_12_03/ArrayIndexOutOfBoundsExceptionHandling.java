package week_12.question_12_03;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        try{
            System.out.print("Enter the index of the array: ");
            int index = input.nextInt();

            System.out.println("You chose : " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds!");

        }
    }
}
