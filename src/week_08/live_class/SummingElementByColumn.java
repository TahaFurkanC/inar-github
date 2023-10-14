package week_08.live_class;

public class SummingElementByColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int column = 0; column < matrix[0].length; column++){
            int sum = 0;
            for(int row = 0; row < matrix.length; row++){
                sum += matrix[row][column];
            }
            System.out.println("Total of the Column " + column + " is " + sum);
        }
    }
}
