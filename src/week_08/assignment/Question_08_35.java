package week_08.assignment;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix : ");
        int numOfRows = input.nextInt();

        System.out.println("Enter the matrix row by row : ");
        int[][] matrix = new int[numOfRows][numOfRows];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = findLargestBlock(matrix);

        if (array[2] != 0){
            System.out.println("The maximum square sub-matrix is at (" +
                    array[0] + ", " + array[1] + ") with size " + array[2]);
        }else{
            System.out.println("There is no sub-matrix");
        }

    }

    public static int[] findLargestBlock(int[][] matrix) {
        int[][] result = new int[0][0];
        int[] array = new int[3];
        array[2] = matrix.length;

        if (!areAllElementsOfSubmatrix1(matrix)){

            do{
                boolean st = true;
                array[2]--;
                for(int i = 0 ; i <= matrix.length - array[2] ; i++) {
                    for (int j = 0; j <= matrix[i].length - array[2]; j++) {
                        st = false;
                        result = getSubmatrix(matrix, array[2], i, j);

                        if(areAllElementsOfSubmatrix1(result)){
                            st = true;
                            array[0] = i;
                            array[1] = j;
                            break;
                        }
                    }

                    if(st){
                        break;
                    }
                }

            }while (array[2] > 1 && !areAllElementsOfSubmatrix1(result));

            if(!areAllElementsOfSubmatrix1(result)){
                array[2] = 0;
            }
        }

        return array;
    }

    public static boolean areAllElementsOfSubmatrix1(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i != 1){
                    return false;
                }
            }
        }

        return true;
    }
    public static int[][] getSubmatrix(int[][] matrix, int size, int i, int j) {
        int[][] result = new int[size][size];

        for (int k = i, s = 0; k < i + size; k++, s++) {
            for (int l = j, m = 0; l < j + size ; l++, m++) {
                result[s][m] = matrix[k][l];
            }
        }

        return result;
    }
}
