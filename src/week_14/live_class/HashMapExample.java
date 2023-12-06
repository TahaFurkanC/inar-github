package week_14.live_class;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");

        System.out.println("HashMap Elements:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " +
                    entry.getValue());
        }
        int keyToCheck = 2;
        if (hashMap.containsKey(keyToCheck)) {
            String value = hashMap.get(keyToCheck);
            System.out.println("\nValue for Key " + keyToCheck + ": " + value);
        }

        
        hashMap.remove(1);

        System.out.println("\nUpdated HashMap Elements:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " +
                    entry.getValue());
        }

    }
}
