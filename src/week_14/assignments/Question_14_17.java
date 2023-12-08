package week_14.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (0 for stop)");
        int num = input.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        while (num != 0) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            num = input.nextInt();
        }
        System.out.println(map);
        //12 -2 12 93 82 73 61 12 9 83 -12 83 0
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        int max = map.get(list.get(0));
        int maxKey = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (map.get(list.get(i)) > max) {
                max = map.get(list.get(i));
                maxKey = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) == max) {
                System.out.println(list.get(i) + "--->" + max + " times");
            }
        }
    }
}
