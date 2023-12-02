package week_13.question_13_02;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        shuffle(list);
        System.out.println(list);
    }
    public static void shuffle(ArrayList<Number> list){

        Collections.shuffle(list);
    }
}
