package week_13.question_13_03;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Question_13_03 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                int number = (int) (Math.random() * 10);
                list.add(number);
            }

            if (i >= 5) {
                double number = Math.random() * 10;
                list.add(number);
            }

        }

        System.out.println("Before sorting : ");
        System.out.println(list);

        System.out.println("After sorting : ");
        sort(list);
        System.out.println(list);

    }


    private static void sort(ArrayList<Number> list) {
        int beginningIndex = 0;

        while (beginningIndex < list.size()) {

            Number min = list.get(beginningIndex);
            int index = beginningIndex;

            for (int i = beginningIndex + 1; i < list.size(); i++) {
                if (list.get(i).doubleValue() < min.doubleValue()) {
                    index = i;
                    min = list.get(i);
                }
            }

            if (index != beginningIndex) {
                Number temp = list.get(beginningIndex);
                list.remove(index);
                list.remove(beginningIndex);
                list.add(beginningIndex, min);
                list.add(temp);
            }

            beginningIndex++;
        }
    }
}
