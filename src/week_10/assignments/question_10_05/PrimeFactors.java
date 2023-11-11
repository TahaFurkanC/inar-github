package week_10.assignments.question_10_05;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2; // Starting factor
        while (number != 1) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }

        System.out.print("The smallest factors in decreasing order are: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
