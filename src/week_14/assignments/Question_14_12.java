package week_14.assignments;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Question_14_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = input.next();


        String[] ch = s.split("");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if (!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            } else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }
        ArrayList<String> list23 = new ArrayList<>(map.keySet());
        System.out.println(list23);
        int index = -1;
        for (int i = 0; i < list23.size(); i++) {
            if (map.get(list23.get(i)) == 1) {
                index = i + 1;
                break;
            }

        }
        if (index != -1) {
            System.out.println(index + " and " + list23.get(index - 1));
        } else {
            System.out.println(index);
        }

    }
}
