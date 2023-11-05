package week_09.assignment.Question_09_10;

public class QuadraticEquation {
    //            -------------------------------------
//            |     QuadraticEquation             |
//            -------------------------------------
//            | - a: double                       |
//            | - b: double                       |
//            | - c: double                       |
//            -------------------------------------
//            | + QuadraticEquation(a: double,    |
//            |       b: double, c: double)       |
//            | + getA(): double                  |
//            | + getB(): double                  |
//            | + getC(): double                  |
//            | + getDiscriminant(): double       |
//            | + getRoot1(): double              |
//            | + getRoot2(): double              |
//            -------------------------------------
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }
}
