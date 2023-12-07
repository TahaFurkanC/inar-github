package week_14.assignments.question_14_03;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CompareY implements Comparator<Point> {









    @Override
    public int compare(Point o1, Point o2) {
        if(o1.getY() > o2.getY()){
            return 1;
        }
        else if (o1.getY() < o2.getY()) {
            return -1;
        }
        else{
            if(o1.getX() > o2.getX()){
                return 1;
            }
            else if (o1.getX() < o2.getX()){
                return -1;
            }
            else{
                return 0;
            }
        }
    }

    @Override
    public Comparator<Point> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Point> thenComparing(Comparator<? super Point> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Point> thenComparing(Function<? super Point, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Point> thenComparing(Function<? super Point, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Point> thenComparingInt(ToIntFunction<? super Point> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Point> thenComparingLong(ToLongFunction<? super Point> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Point> thenComparingDouble(ToDoubleFunction<? super Point> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
