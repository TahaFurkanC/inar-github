package week_11.question_11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int m = input.nextInt();
        ArrayList<Integer> factors = getFactors(m);

        int n = findN(factors);
        for (Integer integer : factors) {
            System.out.print(integer + " ");
        }
        System.out.println("The smallest number n for m * n to be a perfect square is " + n + " m * n is " + m * n);
    }


    public static ArrayList<Integer> getFactors(int m) {
        ArrayList<Integer> factors = new ArrayList<>();
        int i = 2;
        while (m != 1) {

            if (m % i == 0) {
                factors.add(i);
                m /= i;
            } else {
                i++;
            }
        }
        return factors;
    }

    public static int findN(ArrayList<Integer> factors) {
        int n = 1;
        ArrayList<Integer> seenNumbers = new ArrayList<>();

        for (int i = 0; i < factors.size() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < factors.size(); j++) {

                if (factors.get(i) == factors.get(j) && !seenNumbers.contains(factors.get(i))) {
                    count++;
                }
            }

            if (count % 2 != 0 && !seenNumbers.contains(factors.get(i))) {
                n *= factors.get(i);
            } else {
                seenNumbers.add(factors.get(i));
            }
        }

        int lastFactor = factors.get(factors.size() - 1);
        if (!seenNumbers.contains(lastFactor))
            n *= lastFactor;

        return n;
    }
}
