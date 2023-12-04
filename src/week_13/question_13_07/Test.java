package week_13.question_13_07;

import week_13.question_13_06.Circle;
import week_13.question_13_06.GeometricObject;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList <GeometricObject> list = new ArrayList<>();
        list.add(new Circle(5));
        list.add(new Circle(10));
        list.add(new Circle(15));
        list.add(new Square(20));
        list.add(new Square(25));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Area of Geometric Object in the index " +
                    i + " is : " + list.get(i).getArea());
            if(list.get(i) instanceof Colorable){
                ((Square) list.get(i)).howToColor();
            }
            System.out.println("-------------------------------");
        }

//        int[] arr = {5,10,15,20,25,5,3,6,3,6};
//
//        ArrayList<Integer> sayilar = new ArrayList<>();
//
//        for (Integer a : arr) {
//            sayilar.add(a);
//        }
//        System.out.println(sayilar);
    }
}
