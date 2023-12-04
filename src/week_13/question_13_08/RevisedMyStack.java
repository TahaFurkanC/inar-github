package week_13.question_13_08;

import java.util.ArrayList;

public class RevisedMyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {

        return list.isEmpty() ? null : list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {

        list.add(o);
    }

    @Override
    public String toString() {

        return "stack: " + list.toString();
    }

    @Override
    public RevisedMyStack clone() {
        try {
            RevisedMyStack sheep = (RevisedMyStack) super.clone();
            sheep.list = (ArrayList<Object>) list.clone();
            return sheep;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
