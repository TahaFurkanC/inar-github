package week_13.question_13_14;

public class Rational extends Number implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private long[] r = new long[2];

    public Rational() {
        this(0, 1);
    }

    public Rational(long n, long d) {
        long gcd = gcd(n, d);
        this.r[0] = ((n > 0) ? 1 : -1) * n / gcd;
        this.r[1] = Math.abs(d) / gcd;
    }

    private long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        long gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }

        }
        return gcd;
    }


    public void setR(long[] r) {
        this.r = r;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public Rational add(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator() +
                r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator()
                - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.r[0];
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override
    public boolean equals(Object other) {
        return ((this.subtract((Rational) (other))).getNumerator() == 0);
    }



    @Override
    public int compareTo( Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
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
        return 0;
    }

    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }
}

