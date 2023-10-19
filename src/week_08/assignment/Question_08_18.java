package week_08.assignment;

import java.util.Arrays;

public class Question_08_18 {
    public static void main(String[] args) {

        int[][] m = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};

        System.out.println("Shuffled version: " + Arrays.deepToString(shuffle(m)));
    }
    public static int[][] shuffle(int[][] m){
        for(int i = 0; i < m.length-1; i++){
            int a = (int)(Math.random() * m.length);
            int[] temp = m[i];
            m[i] = m[a];
            m[a] = temp;
        }
        return m;
    }
}
