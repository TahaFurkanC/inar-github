package week_13.question_13_12;

import week_13.question_13_06.Circle;
import week_13.question_13_06.GeometricObject;
import week_13.questıon_13_10.Rectangle;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] arr = {new Circle(5),new Circle(7),
        new Rectangle(4,12),new Rectangle(8,15)};

        System.out.println("Total area of Geometric objects: " +
                sumArea(arr));

    }
    private static double sumArea(GeometricObject[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getArea();
        }
        return sum;
    }
}
