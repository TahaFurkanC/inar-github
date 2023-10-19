package week_08.assignment;

import java.util.Arrays;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        System.out.println(Arrays.deepToString(sort(array)));
    }
    public static int[][] sort(int[][] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i][0] > array[j][0]){
                    int[]temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i][0] == array[j][0] && array[i][1] > array[j][1]){
                    int[] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
