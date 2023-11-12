package week_10.assignments.question_10_17;

import java.math.BigInteger;

public class SquareNumbers {
    public static void main(String[] args) {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger start = new BigInteger(String.valueOf(maxLong.sqrt().add(BigInteger.ONE)));

        for (int i = 0; i < 10; i++) {
            System.out.println(start.multiply(start));
            start = start.add(BigInteger.ONE);
        }
    }
}

