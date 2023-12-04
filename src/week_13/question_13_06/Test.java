package week_13.question_13_06;

public class Test {
    public static void main(String[] args) {

        ComparableCircle o1 = new ComparableCircle("white",true,5);
        System.out.println("ComparableCircle1 :\n" + o1);

        ComparableCircle o2 = new ComparableCircle("blue",false,9);
        System.out.println("ComparableCircle2 :\n" + o2);

        if(o1.compareTo(o2) == 1){
            System.out.println("ComparableCircle1 is the larger from ComparableCircle2");
        } else if (o1.compareTo(o2) == -1) {
            System.out.println("ComparableCircle2 is the larger from ComparableCircle1");
        }
        else
            System.out.println("Two Circles are the same");
    }
}
