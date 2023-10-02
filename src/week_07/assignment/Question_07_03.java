package week_07.assignment;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100:");
        int[] numbers = new int[100];
        int count = 0;
        while(true){
            int num = input.nextInt();
            if(num == 0)
                break;
            else if(num > 0 && num < 100){
                numbers[count++] = num;
            }
            else {
                System.out.println("Wrong input!");
                break;
            }
        }
        occur(numbers);
    }
    public static void occur(int[] numbers){
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] == 0)
                break;
            int count = 0;
            for(int j = 0; j < numbers.length - 1; j++){
                if(numbers[i] == numbers[j])
                    count++;
            }
            System.out.println(numbers[i] + " occurs " + count + (count > 1 ? " times" : " time"));
        }
    }
}
