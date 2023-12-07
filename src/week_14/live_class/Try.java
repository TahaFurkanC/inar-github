package week_14.live_class;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Try {
    public static void main(String[] args) {
       Set<String> set = new TreeSet<>();
       set.add("Mehmet");
       set.add("özgür");
       set.add("taha");
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
