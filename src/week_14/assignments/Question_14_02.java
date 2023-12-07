package week_14.assignments;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println("Generated ArrayList: ");
        System.out.println(list);

        Set<Integer> list1 = new TreeSet<>(list);
        System.out.println("ArrayList after removing duplicates: ");
        System.out.println(list1);

//        for (int i = 0; i < list.size() -1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if(list.get(i).equals(list.get(j))){
//                    break;
//                }
//                else{
//                    System.out.print(list.get(i) + " ");
//                    break;
//                }
//            }
//        }
    }
}
