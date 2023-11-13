package week_10.assignments.question_10_21;

import java.math.BigInteger;

public class DivisibleBy5or6 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);
        int count = 0;
        while(count < 10){
            if(a.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                    a.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO)){
                System.out.println(a);
                count++;
            }
            a = a.add(BigInteger.ONE);
        }
    }
}
