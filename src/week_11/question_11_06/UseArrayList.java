package week_11.question_11_06;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayList {
    public static void main(String[] args) {

        ArrayList<Object> varieties = new ArrayList<>();

        varieties.add(new Loan());
        varieties.add(new Date());
        varieties.add(new String("Inar Academy"));
        varieties.add(new Circle());

        for (Object e : varieties) {
            System.out.println(e);
            System.out.println("----------------------");
        }
    }
}
