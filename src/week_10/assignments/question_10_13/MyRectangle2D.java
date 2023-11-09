package week_10.assignments.question_10_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;
    public MyRectangle2D(){
        this(0,0,1,1);
    }
    public MyRectangle2D(double x,double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
    public boolean contains(double x, double y){
        return x > this.x - width / 2 && x < this.x + width / 2 &&
                y > this.y - height / 2 && y < this.y + height / 2;
    }
    public boolean contains(MyRectangle2D r){
        return r.getX() + r.getWidth() / 2 < this.x + this.width / 2 &&
                r.getX() - r.getWidth() / 2 > this.x - this.width / 2 &&
                r.getY() + r.getHeight() / 2 < this.y + this.height / 2 &&
                r.getY() - r.getHeight() / 2 > this.y - this.height / 2 ;
    }
    public boolean overlaps(MyRectangle2D r){
        return !contains(r) &&
          (Math.abs(r.getX() - this.x) < (r.getWidth() + this.width) / 2) ||
          (Math.abs(r.getY() - this.y) < (r.getHeight() + this.height) / 2);
    }
}
