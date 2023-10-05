package week_07.assignment;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers to exclude from random(1-54): ");
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("Number generated: " + getRandom(numbers));
    }
    public static int getRandom(int...numbers){
        int[] fullArray = new int[54];
        for(int i = 0; i < fullArray.length; i++){
            fullArray[i] = (int)(Math.random() * 54) + 1;
        }
        int count = 54;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < fullArray.length; j++){
                if(numbers[i] == fullArray[j])
                    count--;
            }
        }
        return count;
    }
}
