package week_07.assignment;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int[] distinct = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for(int e : distinct){
            if(e > 0)
                System.out.print(e + " ");
        }

    }
    public static int[] eliminateDuplicates(int[] list){
        int[] newList = new int[10];
        for(int i = 0; i < list.length; i++){
            boolean isOneTime = true;
            for(int j = i + 1;j < list.length; j++){
                if(list[i] == list[j])
                    isOneTime = false;
            }
            if(isOneTime)
                newList[i] = list[i];
        }
        return newList;
    }
}
