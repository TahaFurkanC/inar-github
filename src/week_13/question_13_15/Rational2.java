package week_13.question_13_15;

import java.math.BigInteger;

public class Rational2 extends Number implements Comparable<Rational2>{

    private BigInteger nume = BigInteger.ZERO;
    private BigInteger deno = BigInteger.ONE;


    public Rational2() {
    }

    public Rational2(BigInteger nume, BigInteger deno) {
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

    public Rational2 add(Rational2 secondRational) {
        BigInteger n = nume.multiply(secondRational.getDeno()).add(
                deno.multiply(secondRational.getNume()));
        BigInteger d = deno.multiply(secondRational.getDeno());
        return new Rational2(n, d);
    }

    public Rational2 subtract(Rational2 secondRational) {
        BigInteger n = nume.multiply(secondRational.getDeno()).subtract(
                deno.multiply(secondRational.getNume()));
        BigInteger d = deno.multiply(secondRational.getDeno());
        return new Rational2(n, d);
    }

    public Rational2 multiply(Rational2 secondRational) {
        BigInteger n = nume.multiply(secondRational.getNume());
        BigInteger d = deno.multiply(secondRational.getDeno());
        return new Rational2(n, d);
    }

    public Rational2 divide(Rational2 secondRational) {
        BigInteger n = nume.multiply(secondRational.getDeno());
        BigInteger d = deno.multiply(secondRational.nume);
        return new Rational2(n, d);
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
        return ((this.subtract((Rational2) (other))).getNume().equals(BigInteger.ZERO));
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
    public int compareTo(Rational2 o) {

        return this.subtract(o).getNume().compareTo(BigInteger.ZERO);


    }
}
