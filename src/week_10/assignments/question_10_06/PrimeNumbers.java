package week_10.assignments.question_10_06;

import week_10.assignments.question_10_05.StackOfIntegers;

public class PrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        int a = 120;

        for (int i = 2; i <= a; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0)
                    isPrime = false;
            }
            if (isPrime)
                stack.push(i);
        }
        System.out.print("The smallest factors in decreasing order are: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
