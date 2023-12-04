package week_13.question_13_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(this.getArea(),o.getArea());

        //        if(this.getArea() < o.getArea()){
//            return -1;
//        } else if (this.getArea() == o.getArea()) {
//            return 0;
//        }
//        else
//            return 1;
    }
}
