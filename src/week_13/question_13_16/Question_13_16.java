package week_13.question_13_16;

import java.math.BigInteger;

public class Question_13_16 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.exit(1);
        }
        String[] list1 = args[0].split("/");
        String[] list2 = args[2].split("/");

        Rational3 r1 = new Rational3(new BigInteger(list1[0]), new BigInteger(list1[1]));
        Rational3 r2 = new Rational3(new BigInteger(list2[0]), new BigInteger(list2[1]));

        Rational3 result = new Rational3();

        switch (args[1].charAt(0)) {
            case '+':
                result = r1.add(r2);
                break;
            case '-':
                result = r1.subtract(r2);
                break;
            case '*':
                result = r1.multiply(r2);
                break;
            case '/':
                result = r1.divide(r2);
                break;
            default:
                System.out.println("wrong operator");
        }
        System.out.println(r1 + " " + args[1] + " " + r2 + " = " + result);


    }
}

class Rational3 extends Number implements Comparable<Rational3> {
    private BigInteger nume = BigInteger.ZERO;
    private BigInteger deno = BigInteger.ONE;


    public Rational3() {
    }

    public Rational3(BigInteger nume, BigInteger deno) {
        BigInteger gcd = gcd(nume, deno);
        this.nume = BigInteger.valueOf(deno.compareTo(BigInteger.ZERO)).multiply(nume.divide(gcd));
        this.deno = (deno.abs()).divide(gcd);
    }

    private BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();
        BigInteger gcd = BigInteger.ONE;

        BigInteger min = n1.min(n2);

        for (BigInteger j = BigInteger.TWO; j.compareTo(min) < 0; j = j.add(BigInteger.ONE)) {
            if (n1.remainder(j).equals(BigInteger.ZERO) && n2.remainder(j).equals(BigInteger.ZERO))
                gcd = j;

        }

        return gcd;
    }

    public BigInteger getNume() {
        return nume;
    }

    public void setNume(BigInteger nume) {
        this.nume = nume;
    }

    public BigInteger getDeno() {
        return deno;
    }

    public void setDeno(BigInteger deno) {
        this.deno = deno;
    }

    public Rational3 add(Rational3 secondRational) {
        BigInteger n = nume.multiply(secondRational.getDeno()).add(
                deno.multiply(secondRational.getNume()));
        BigInteger d = deno.multiply(secondRational.getDeno());
        return new Rational3(n, d);
    }

    public Rational3 subtract(Rational3 secondRational) {
        BigInteger n = nume.multiply(secondRational.getDeno()).subtract(
                deno.multiply(secondRational.getNume()));
        BigInteger d = deno.multiply(secondRational.getDeno());
        return new Rational3(n, d);
    }

    public Rational3 multiply(Rational3 secondRational) {
        BigInteger n = nume.multiply(secondRational.getNume());
        BigInteger d = deno.multiply(secondRational.getDeno());
        return new Rational3(n, d);
    }

    public Rational3 divide(Rational3 secondRational) {
        BigInteger n = nume.multiply(secondRational.getDeno());
        BigInteger d = deno.multiply(secondRational.nume);
        return new Rational3(n, d);
    }

    @Override
    public String toString() {
        if (deno.equals(BigInteger.ONE))
            return nume + "";
        else
            return nume + "/" + deno;
    }

    @Override
    public boolean equals(Object other) {
        return ((this.subtract((Rational3) (other))).getNume().equals(BigInteger.ZERO));
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return nume.doubleValue() / deno.doubleValue();
    }


    @Override
    public int compareTo(Rational3 o) {

        return this.subtract(o).getNume().compareTo(BigInteger.ZERO);


    }
}
