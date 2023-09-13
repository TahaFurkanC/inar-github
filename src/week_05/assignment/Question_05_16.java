package week_05.assignment;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        int divisor = 2;
        while(number != 1){
            if(number % divisor == 0) {
                number /= divisor;
                System.out.print(divisor + " ");
            }
            else
                divisor++;
        }
    }
}
