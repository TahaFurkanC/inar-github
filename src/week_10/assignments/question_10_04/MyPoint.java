package week_10.assignments.question_10_04;

public class MyPoint {
//            ------------------------------------
//            |             MyPoint               |
//            ------------------------------------
//            | -x: double                        |
//            | -y: double                        |
//            ------------------------------------
//            | +MyPoint()                        |
//            | +MyPoint(x: double, y: double)    |
//            | +getX(): double                   |
//            | +getY(): double                   |
//            | +distance(point: MyPoint): double |
//            | +distance(x: double, y: double): double|
//            ------------------------------------
    private double x , y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        double dx = this.x - point.getX();
        double dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
