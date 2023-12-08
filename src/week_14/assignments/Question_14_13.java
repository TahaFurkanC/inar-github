package week_14.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter size of the list:");
        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * 3));
        }
        System.out.println("Generated list:" + list);
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : list){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer i : map.keySet()){
            //System.out.println(map.get(i));
            if(map.get(i) > size / 3){
                result.add(i);
            }
        }
        System.out.println("Elements appearing more than " + (size / 3) + " times :" + result);
    }
}
