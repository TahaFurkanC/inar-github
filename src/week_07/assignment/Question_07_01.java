package week_07.assignment;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter a score for each student:");
        int [] scores = new int[numberOfStudents];
        int maxScore = 0;
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
            if(scores[i] > maxScore)
                maxScore = scores[i];
        }
        print(scores,maxScore);
    }
    public static void print(int[] scores, int maxScore){
        for(int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " score is " + scores[i] +
                    " and grade is " + getGrade(scores[i],maxScore));
        }
    }
    public static char getGrade(int score,int maxScore){
        if(score >= maxScore - 10)
            return 'A';
        else if(score >= maxScore - 20 )
            return 'B';
        else if(score >= maxScore -30)
            return 'C';
        else if(score >= maxScore -40)
            return 'D';
        else
            return 'F';
    }
}
