package week_14.assignments.question_14_08;

import java.util.Queue;

public class Question_14_08 {
    public static void main(String[] args) {
        MyStack m = new MyStack();
        m.push(54);
        m.push(42);
        m.push(13);
        System.out.println(m.getMainQ());

        System.out.println(m.pop());
        System.out.println(m.getMainQ());

        System.out.println(m.top());
        System.out.println(m.getMainQ());
    }
}
