package week_10.assignments.question_10_19;

import java.math.BigInteger;

public class MersennePrime {
    public static void main(String[] args) {
        int maxP = 100;

        for (int p = 2; p <= maxP; p++) {
            BigInteger mersenneExponent = BigInteger.valueOf(p);
            BigInteger mersenneNumber = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);

            if (isPrime(mersenneExponent) && isPrime(mersenneNumber)) {
                System.out.println("Mersenne prime with p = " + p + ": " + mersenneNumber);
            }
        }
    }

    private static boolean isPrime(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }

        BigInteger sqrt = number.sqrt();
        for (BigInteger i = BigInteger.TWO; i.compareTo(sqrt) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }

        return true;
    }
}
