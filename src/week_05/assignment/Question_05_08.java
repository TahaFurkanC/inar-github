package week_05.assignment;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int number = input.nextInt();
        System.out.println("Enter each student's name and score");

        int highest = 0 ;
        String highestStudent = "";
        for(int i = 1; i <= number; i++){
            System.out.println("Student " + i);
            System.out.print("\tName : ");
            String student = input.next();
            System.out.print("\tScore : ");
            int score = input.nextInt();

            if(score > highest){
                highestStudent = student ;
            }

        }
        System.out.println("Student with the highest score : " + highestStudent);
    }
}
