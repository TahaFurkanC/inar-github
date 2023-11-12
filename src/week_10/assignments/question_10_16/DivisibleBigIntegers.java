package week_10.assignments.question_10_16;

import java.math.BigInteger;

public class DivisibleBigIntegers {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("10");
        for (int i = 0; i < 48; i++) {
            a = a.multiply(b);
        }
        int count = 0;
        BigInteger c = new BigInteger("3");
        while(count < 10){
            if(a.mod(BigInteger.TWO).equals(BigInteger.ZERO) || a.mod(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(a);
                count++;
            }
            a = a.add(BigInteger.ONE);
        }
    }
}
