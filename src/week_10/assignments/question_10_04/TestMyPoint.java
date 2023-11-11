package week_10.assignments.question_10_04;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10,30.5);
        System.out.println("The distance between (0.0,0.0) and (10.0,30.5) is : " +
                p1.distance(p2));
    }
}
