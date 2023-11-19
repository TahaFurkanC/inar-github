package week_11.question_11_10;

import java.util.ArrayList;
public class MyStack extends ArrayList<Object>{
    public MyStack(){

    }
    public int getSize(){
        return super.size();
    }
    public Object peek(){
        return super.get(super.size()-1);
    }
    public Object pop(){
        return super.remove(super.size()-1);
    }
    public void push(Object o){
        super.add(o);
    }
    public String toString() {
         return "stack: " + super.toString();
        }
}
