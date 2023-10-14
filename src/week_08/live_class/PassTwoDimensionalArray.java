package week_08.live_class;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = getAnArray();

        System.out.println("Sum of the array elements is " + sumArray(array));
    }
    public static int[][] getAnArray(){
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][5];
        System.out.println("Enter " + array.length * array[0].length + " array values");
        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                array[i][k] = input.nextInt();
            }
        }
        return array;
    }
    public static int sumArray(int[][] array){
        int sum = 0;
        for(int i = 0 ; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                sum += array[i][k];
            }
        }
        return sum;
    }
}
