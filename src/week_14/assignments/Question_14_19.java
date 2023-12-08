package week_14.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a DNA sequence");
        String dna = input.next();

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < dna.length()-4; i++) {
            String s = dna.substring(i,i+5);
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else{
                map.put(s,map.get(s) + 1);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        for(String st : list){
            if(map.get(st) > 1){
                System.out.print(st + " , ");
            }
        }
    }
}
