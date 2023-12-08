package week_14.assignments;

import java.util.*;

public class Question_14_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements(n):");
        int n = input.nextInt();
        System.out.println("Enter the elements of the ArrayList(each in range [1,n]:");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        ArrayList<Integer> result = getIntegers(list, n);
        System.out.println("Number Missing from the ArrayList:" + result);

    }

    private static ArrayList<Integer> getIntegers(ArrayList<Integer> list, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : list){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean a = true;
            for (int j = 0; j < keys.size(); j++) {
                if(i == keys.get(j)){
                    a = false;
                    break;
                }
            }
            if(a){
                result.add(i);
            }
        }
        return result;
    }
}
