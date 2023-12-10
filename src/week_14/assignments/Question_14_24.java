package week_14.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question_14_24 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        int k = 5;

        for (int i = 0; i < 10; i++) {
            num.add((int) (Math.random() * 20));
        }

        System.out.println("Array : " + num);
        boolean result = containsNearbyDuplicate(num, k);
        if (result) {
            System.out.print("is there a nearby duplicate with absolute difference at most 5 ? " + result);
        } else {
            System.out.println("is there a nearby duplicate with absolute difference at most 5 ? " + result);
        }


    }

    public static boolean containsNearbyDuplicate(ArrayList<Integer> num, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < num.size(); i++) {
            if (!set.add(num.get(i))) {
                for (int j = 0; j < i; j++) {
                    if (num.get(i) == num.get(j)) {
                        if (i - j > k) {
                            return false;
                        } else
                            return true;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
