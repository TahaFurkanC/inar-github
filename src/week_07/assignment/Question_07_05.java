package week_07.assignment;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = new int[10];
        int countOfDistinct = 0;
        for(int i = 0; i < numbers.length; i++){
            if(containsOne(distinctNumbers,numbers[i],countOfDistinct)){
                distinctNumbers[countOfDistinct] = numbers[i];
                countOfDistinct++;
            }
        }
        displayArray(numbers,10);
        System.out.println("\nThe number of distinct numbers is: " + countOfDistinct);
        System.out.print("The distinct numbers are: "); displayArray(distinctNumbers, countOfDistinct);
    }
    public static boolean containsOne(int[] distinctNumbers,int a, int countOfDistinct){
        for(int i = 0; i < countOfDistinct; i++){
            if(distinctNumbers[i] == a)
                return false;
        }
        return true;
    }
    public static void displayArray(int[]array, int size){
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}
