package week_10.assignments.question_10_01;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);

        System.out.println("Time 1: " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println("Time 2: " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
    }
}
