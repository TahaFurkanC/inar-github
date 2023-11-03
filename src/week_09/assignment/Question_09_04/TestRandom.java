package week_09.assignment.Question_09_04;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 1; i <= 50; i++) {

            if(i % 10 == 0){
                System.out.println(random.nextInt(100));
            }
            else
                System.out.print(random.nextInt(100) + " ");
        }
    }
}
