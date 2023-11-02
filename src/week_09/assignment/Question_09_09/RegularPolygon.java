package week_09.assignment.Question_09_09;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(){
    n = 3;
    side = 1;
    x = 0;
    y = 0;
    }
    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));
    }
}
