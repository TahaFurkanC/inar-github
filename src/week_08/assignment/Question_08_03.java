package week_08.assignment;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] scoresAndIndex = new int[8][2];

        for(int i = 0; i < answers.length; i++){
            int correctCount = 0;
            for(int k = 0; k < answers[i].length; k++){
                if(answers[i][k] == keys[k]){
                    correctCount++;
                }
            }
            scoresAndIndex[i][0] = correctCount;
            scoresAndIndex[i][1] = i;
        }
        for(int i = 0; i < scoresAndIndex.length - 1; i++){
            for(int k = i + 1; k < scoresAndIndex.length; k++){
                if(scoresAndIndex[i][0] > scoresAndIndex[k][0]){
                    int[] temp = scoresAndIndex[i];
                    scoresAndIndex[i] = scoresAndIndex[k];
                    scoresAndIndex[k] = temp;
                }
            }
        }
        for(int i = 0; i < scoresAndIndex.length; i++){
            System.out.println("Student " + scoresAndIndex[i][1] + "´s correct count is " +
                    scoresAndIndex[i][0]);
        }
    }
}
