package week_05.live_class;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        int gcd = 1;
        int b = 2;

        while(b <= number1 && b <= number2){
            if(number1 % b ==0 && number2 % b == 0)
                gcd = b;
            b++;
        }
        System.out.println("The Great Common Divisor of " + number1 + " and " + number2 + " is " + gcd);
    }
}
