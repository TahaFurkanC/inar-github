package week_08.assignment;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        boolean even = true;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
                if(matrix[i][j] == 1)
                    count++;
            }
            System.out.println();
            if(count % 2 != 0)
                even = false;
        }
        System.out.println("Every row " + (even ? "have" : "does not have") + " an even number of 1s");

        boolean evenColumn = true;
        for (int i = 0; i < matrix[0].length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == 1)
                    counter++;
            }
            if(counter % 2 != 0)
                evenColumn = false;
        }
        System.out.println("Every column " + (evenColumn ? "have" : "does not have") + " an even number of 1s");
    }
}
