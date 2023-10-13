package week_07.assignment;

import java.util.Arrays;

public class Question_07_29 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int[] cards = new int[4];
        while (sum != 24) {
            sum = 0;
            count++;
            for (int i = 0; i < 4; i++) {
                cards[i] = pick();
                sum += cards[i];
            }
        }
        System.out.println("The number of picks : " + count + "  |||| Cards : " + Arrays.toString(cards));

    }
    public static int pick(){
        return ((int)(Math.random() * 52) + 1) % 13;
    }
}
