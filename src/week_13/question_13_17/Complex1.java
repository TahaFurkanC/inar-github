package week_13.question_13_17;

public class Complex1 implements Cloneable{
    private double realPart;
    private double imaginaryPart;

    public Complex1() {
    }

    public Complex1(double realPart) {
        this.realPart = realPart;
    }

    public Complex1(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex1 add(Complex1 c) {
        double rp = this.realPart + c.getRealPart();
        double ip = this.imaginaryPart + c.getImaginaryPart();

        return new Complex1(rp, ip);
    }

    public Complex1 subtract(Complex1 c) {
        double rp = this.realPart - c.getRealPart();
        double ip = this.imaginaryPart - c.getImaginaryPart();

        return new Complex1(rp, ip);
    }

    // (3 + i) * (4 * 2i)
    public Complex1 multiply(Complex1 c) {
        double rp = this.realPart * c.getRealPart() - this.imaginaryPart * c.getImaginaryPart();
        double ip = this.imaginaryPart * c.getRealPart() + this.realPart * c.getImaginaryPart();

        return new Complex1(rp, ip);
    }

    public Complex1 divide(Complex1 c) {
        double rp = (this.realPart * c.getRealPart() + this.imaginaryPart * c.getImaginaryPart()) /
                (Math.pow(c.realPart, 2) + (Math.pow(c.imaginaryPart, 2)));

        double ip = (this.imaginaryPart * c.getRealPart() - this.realPart * c.getImaginaryPart()) /
                (Math.pow(c.realPart, 2) + (Math.pow(c.imaginaryPart, 2)));

        return new Complex1(rp, ip);
    }

    public double abs() {
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
    }

    public String toString() {
        if (imaginaryPart == 0) {
            return realPart + "";
        }

        if (realPart == 0) {
            return imaginaryPart + "i";
        }

        return realPart + " + " + imaginaryPart + "i";
    }

    @Override
    public Complex1 clone() throws CloneNotSupportedException {
        return (Complex1) super.clone();
    }
}
