package week_14.live_class;

import java.util.ArrayList;

public class TestSize {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Eleman sayısı: " + arrayList.size());

        arrayList.add("Orangedrgd");

        System.out.println("Yeni kapasite: " + arrayList.size());

        arrayList.add("rthrthd");
        arrayList.add("Otrhrthrtrgd");
        arrayList.add("Oranfgnfgnrgd");

        System.out.println("Yeni kapasite: " + arrayList.size());

        arrayList.trimToSize();

        System.out.println("Yeni kapasite: " + arrayList.size());
    }
}
