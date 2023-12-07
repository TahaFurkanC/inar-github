package week_14.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Question_14_16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\HP\\workspace\\inar-java" +
                "\\src\\week_14\\assignments\\Question_14_16.java");
        if(!file.exists()){
            System.out.println("Go home!");
            System.exit(1);
        }
        Scanner input = new Scanner(file);

        Map<String, Integer> map = new TreeMap<>();
        while(input.hasNext()){
            String word = input.next();
            String[] str = word.split("[\\s._;}/:!{)(\\[\\]\\\\<>+*=,\"\\-]+");
            for (int i = 0; i < str.length; i++) {
                if(!map.containsKey(str[i])){
                    map.put(str[i], 1);
                }
                else{
                    map.put(str[i], map.get(str[i]) + 1);
                }
            }
        }
        Set<String> list = map.keySet();
        for (String s : list) {
            System.out.println(s + " : " + map.get(s));
        }

    }
}
