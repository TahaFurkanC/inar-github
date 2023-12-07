package week_14.assignments.question_14_03;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point[] point = new Point[100];

        for (int i = 0; i < 100; i++) {
            point[i] = new Point((int)(Math.random() * 100),(int)(Math.random() * 100));
        }
        System.out.print("Original list:");
        System.out.println(Arrays.toString(point));

        System.out.print("Sorted list according to x :");
        Arrays.sort(point);
        System.out.println(Arrays.toString(point));

        System.out.print("Sorted list according to y :");
        Arrays.sort(point, new CompareY());
        System.out.println(Arrays.toString(point));

    }
}
