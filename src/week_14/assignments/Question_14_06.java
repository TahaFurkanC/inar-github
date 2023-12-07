package week_14.assignments;

import java.util.ArrayList;

public class Question_14_06 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println("Original list: " + list);
        int a = list.size();
        for (int i = 0; i < a; i++) {
            if(list.get(i) % 2 == 0){
                list.add(list.get(i));
                list.remove(i);
                i--;
                a--;
            }
        }
        System.out.println("Rearranged List: " + list);
    }
}
