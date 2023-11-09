package week_10.assignments.question_10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    Circle2D(){
        this(0, 0, 1);
    }

    Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    public boolean contains(double x, double y){
        return Math.sqrt(Math.pow((this.x - x), 2) +
                Math.pow((this.y - y), 2)) <= radius;
    }

    public boolean contains(Circle2D circle2D){
        double distance = Math.sqrt(Math.pow((circle2D.getX() - this.x), 2) +
                Math.pow((circle2D.getY() - this.y), 2));

        return distance <= Math.abs(this.radius - circle2D.getRadius());
    }

    public boolean overlaps(Circle2D circle2D){
        double distance = Math.sqrt(Math.pow((circle2D.getX() - this.x), 2) +
                Math.pow((circle2D.getY() - this.y), 2));

        return distance <= Math.abs(this.radius - circle2D.getRadius()) &&
                Math.abs(this.radius - circle2D.getRadius()) <= this.radius + circle2D.getRadius();
    }
}
