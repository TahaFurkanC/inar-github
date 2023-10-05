package week_07.assignment;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        System.out.println("The minimum number is " + numbers[indexOfSmallestElement(numbers)] + " index "
                + indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(double[] array){
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[index] > array[i])
                index = i;
        }
        return index;
    }
}
