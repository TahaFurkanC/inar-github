package week_14.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Question_14_23 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\HP\\workspace\\inar-java" +
                "\\src\\week_14\\assignments\\Question_14_23.java");
        if(!file.exists()){
            System.out.println("Go Home Bro!");
            System.exit(1);
        }
        Scanner input = new Scanner(file);
        Map<String, Integer> map = new TreeMap<>();
        while(input.hasNext()){
            String word = input.next();
            String[] arr = word.split("[\\s._;}/:!{)(\\[\\]\\\\<>+*=,\"\\-]+");
                for (int i = 0; i < arr.length; i++) {
                    if(!map.containsKey(arr[i])){
                        map.put(arr[i], 1);
                    }
                    else{
                        map.put(arr[i], map.get(arr[i]) + 1);
                    }
                }
        }
        System.out.println(map);
        Set<String> list = map.keySet();
        for(String key : list){
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
