package week_14.assignments.question_14_09;

import java.util.LinkedList;
import java.util.Stack;

public class MyQueue {

    private Stack<Integer> mainS;
    private Stack<Integer> tempS;

    public MyQueue(){
        mainS = new Stack<>();
        tempS = new Stack<>();
    }

    public Stack<Integer> getMainS() {
        return mainS;
    }

    public void push(int x) {
        mainS.push(x);
    }
    public int pop() {
        if (tempS.isEmpty()) {
            while (!mainS.isEmpty()) {
                tempS.push(mainS.pop());
            }
        }
        return tempS.pop();
    }
    public int peek() {
        if (tempS.isEmpty()) {
            while (!mainS.isEmpty()) {
                tempS.push(mainS.pop());
            }
        }
        return tempS.peek();
    }
    public boolean empty() {
        return mainS.isEmpty() && tempS.isEmpty();
    }
}
