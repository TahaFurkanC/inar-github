package week_13.question_13_19;

import week_13.question_13_15.Rational2;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        String answer = input.next();

        String[] arr = answer.split(",");
        String numerator = arr[0] + arr[1]; //325
        String denominator = (int)(Math.pow(10,arr[1].length()))  + "";

        Rational2 num = new Rational2(new BigInteger(numerator), new BigInteger(denominator));

        System.out.println("The fraction number is " + num);
    }
}
