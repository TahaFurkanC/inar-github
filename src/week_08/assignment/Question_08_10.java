package week_08.assignment;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int maxOfRow = 0;
        int maxRowIndex = 0;
        int maxOfColumn = 0;
        int maxColumnIndex = 0;

        for(int i = 0; i < matrix.length; i++){
            int counter = 0;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1)
                    counter++;
            }
            if(counter > maxOfRow){
                maxOfRow = counter;
                maxRowIndex = i;
            }
        }
        for(int i = 0; i < 4; i++){
            int count = 0;
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] == 1)
                    count++;
            }
            if(maxOfColumn < count){
                maxOfColumn = count;
                maxColumnIndex = i;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColumnIndex);
    }
}
