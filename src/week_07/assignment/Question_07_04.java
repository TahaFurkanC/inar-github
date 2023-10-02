package week_07.assignment;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores(negative number signifies end): ");
        int aboveTheAverage = 0;
        int sum = 0;
        int count = 0;
        int[] scores = new int[100];
        while(true){
            int temp = input.nextInt();
            if(temp< 0 || temp > 100)
                break;
            else{
                scores[count++] = temp;
                sum += temp;
            }
        }
        System.out.println("Average of scores: " + sum / count);
        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= (sum / count))
                aboveTheAverage++;
        }
        System.out.println("Number of scores above or equal to average: " + aboveTheAverage);
        System.out.println("Number of scores below the average: " + (count - aboveTheAverage));


    }
}
