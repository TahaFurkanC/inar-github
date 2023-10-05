package week_07.assignment;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor is " + gcd(numbers));
    }
    public static int min(int... numbers){
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }
    public static int gcd(int... numbers){
        int min = min(numbers);
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % min != 0){
                min /= 2;
                break;
            }
        }
        return min;
    }
}
