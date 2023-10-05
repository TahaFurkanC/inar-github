package week_07.assignment;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        for(int i : reverse(numbers)){
            System.out.print(i + " ");
        }
    }
    public static int[] reverse(int[] numbers){
        int[] reversed = new int[numbers.length];
        for(int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--){
            reversed[j] = numbers[i];
        }
        return reversed;
    }
}
