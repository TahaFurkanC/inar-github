package week_14.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Question_14_24 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            num.add((int) (Math.random() * 20));
        }

        System.out.println("Array : " + num);
        boolean result = containsNearbyDuplicate(num);
        if (result) {
            System.out.print("is there a nearby duplicate with absolute difference at most 5 ? " + result);
        } else {
            System.out.println("is there a nearby duplicate with absolute difference at most 5 ? " + result);
        }


    }

    public static boolean containsNearbyDuplicate(ArrayList<Integer> num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.size(); i++) {
            if (!map.containsKey(num.get(i))) {
                map.put(num.get(i), i);
            } else {
                if (i - map.get(num.get(i)) <= 5) {
                    return true;
                } else {
                    map.put(num.get(i), i);
                }
            }
        }
        return false;
    }
}
