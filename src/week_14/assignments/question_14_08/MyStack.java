package week_14.assignments.question_14_08;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> mainQ;
    private Queue<Integer> tempQ;

    public MyStack(){
        mainQ = new LinkedList<>();
        tempQ = new LinkedList<>();
    }

    public Queue<Integer> getMainQ() {
        return mainQ;
    }

    public void setMainQ(Queue<Integer> mainQ) {
        this.mainQ = mainQ;
    }

    public void push(int x){
        mainQ.add(x);
    }
    public int pop(){
        //return ((LinkedList<Integer>)mainQ).removeLast();
        int size = mainQ.size();
        for (int i = 0; i < size -1; i++) {
            tempQ.add(mainQ.remove());
        }
        int a = mainQ.remove();
        mainQ.addAll(tempQ);
        while(!tempQ.isEmpty()){
            tempQ.remove();
        }
        return a;
    }
    public int top(){
        //return ((LinkedList<Integer>)mainQ).getLast();

        int size = mainQ.size();
        for (int i = 0; i < size -1; i++) {
            tempQ.add(mainQ.remove());
        }
        tempQ.add(mainQ.peek());
        int a = mainQ.remove();
        mainQ.addAll(tempQ);
        while(!tempQ.isEmpty()){
            tempQ.remove();
        }
        return a;
    }
    public boolean isEmpty(){
        return mainQ.isEmpty();
    }
}
