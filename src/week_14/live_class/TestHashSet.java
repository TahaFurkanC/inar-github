package week_14.live_class;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Banana");

        System.out.println("HashSet Elements:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
        String searchFruit = "Banana";

        System.out.println("\nDoes HashSet contain " + searchFruit + "? " +
                hashSet.contains(searchFruit));

        hashSet.remove("Orange");

        System.out.println("\nUpdated HashSet Elements:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}
