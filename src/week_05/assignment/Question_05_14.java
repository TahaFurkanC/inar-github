package week_05.assignment;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer : ");
        int first = input.nextInt();
        System.out.println("Enter second integer : ");
        int second = input.nextInt();

        if(first < second) {
            int temp = first;
            first = second;
            second = temp;
        }
        int divisor = second;

        if(first % divisor == 0) {
            System.out.println("The greatest common divisor for " + first + " and "
                    + second + " is " + divisor);
            System.exit(1);
        }
        else
            while(first % divisor != 0)
                divisor --;

        System.out.println("The greatest common divisor for " + first + " and "
                + second + " is " + divisor);

    }
}
