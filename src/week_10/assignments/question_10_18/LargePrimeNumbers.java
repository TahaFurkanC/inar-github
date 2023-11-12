package week_10.assignments.question_10_18;

import java.math.BigInteger;

public class LargePrimeNumbers {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);

        int count = 0;
        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }

    }


    public static boolean isPrime(BigInteger number) {
        BigInteger divisor = new BigInteger(("2"));
        BigInteger stop = new BigInteger(String.valueOf(number.divide(divisor)));
        while (divisor.compareTo(stop) < 0) {
            if (number.remainder(divisor).equals(BigInteger.ZERO)) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }
}
