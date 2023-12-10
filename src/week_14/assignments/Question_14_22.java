package week_14.assignments;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question_14_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = input.nextInt();

        System.out.println(num + " is " +(isHappyNumber(num) ? " a " : " not a ") + " happy number");
    }
    public static boolean isHappyNumber(int num){
        Set<Integer> set = new HashSet<>();

        while(num != 1 && !set.contains(num)){
            set.add(num);
            num = sumOfSquare(num);
        }
        return num == 1;
    }
    public static int sumOfSquare(int num){
        int sum = 0;
        int a = 0;
        while(num != 0){
            a = num % 10;
            sum += a * a;
            num = num / 10;
        }
        return sum;
    }
}
