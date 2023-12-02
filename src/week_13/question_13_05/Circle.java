package week_13.question_13_05;

public class Circle extends GeometricObject{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0 ? newRadius : 0);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {

        return  super.toString() +
                "\nRadius: " + this.radius +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();
    }
    public double multiply(){
        return 2 * radius;
    }
}
