package week_06.assignment;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        System.out.println(number + (isValid(number) ? " is valid" : " is invalid"));
    }
    public static boolean isValid(long number){
        String numStr = String.valueOf(number);
        if(numStr.length() < 13 || numStr.length() > 16){
            return false;
        }
        else if(prefixMatched(number,4) || prefixMatched(number,5) ||
                prefixMatched(number,37) || prefixMatched(number,6)){
            int sumEven = sumOfDoubleEvenPlace(number);
            int sumOdd = sumOfOddPlace(number);
            int total = sumEven + sumOdd;
            return total % 10 == 0;
        }
        return false;
    }
    public static int sumOfDoubleEvenPlace(long number){
        String numStr = String.valueOf(number);
        int sum = 0;
        for(int i = numStr.length() - 2; i >= 0 ; i -= 2){
            int digit = Integer.parseInt(numStr.substring(i, i + 1));
            if(digit * 2 >= 10){
                sum += getDigit(digit * 2);
            }
            else
                sum += (digit * 2);
        }
        return sum;
    }
    public static int getDigit(int number) {
        if (getSize(number) > 1) {
            int d1 = number % 10;
            int d2 = number / 10;
            return d1 + d2;
        }
        return number;
    }
    public static int getSize(int number){
        String numStr = String.valueOf(number);
        return numStr.length();
    }
    public static int sumOfOddPlace(long number){
        String numStr = String.valueOf(number);
        int sum = 0;
        for(int i = numStr.length() -1; i >= 0; i -= 2){
            sum += Integer.parseInt(numStr.substring(i,i + 1));
        }
        return sum;
    }
    public static boolean prefixMatched(long number, int d) {
        String s = String.valueOf(number);
        if (s.startsWith(String.valueOf(d))) {
            return true;
        }
        return false;
    }
}
