package week_14.assignments.question_14_09;

import week_14.assignments.question_14_08.MyStack;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue m = new MyQueue();
        m.push(54);
        m.push(42);
        m.push(13);

        System.out.println(m.peek());

        System.out.println(m.pop());

        System.out.println(m.empty());
    }
}
