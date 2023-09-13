package week_05.assignment;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int number = input.nextInt();

        int highestScore = 0;
        int secondScore = 0;
        String highestStudent = "";
        String secondStudent = "";

        for (int i = 1; i <= number; i++) {
            System.out.println("Student : " + i);
            System.out.print("\tName : ");
            String name = input.next();
            System.out.print("\tScore : ");
            int score = input.nextInt();

            if (score > highestScore) {
                secondScore = highestScore;
                secondStudent = highestStudent;
                highestScore = score;
                highestStudent = name;
            } else if (score > secondScore) {
                secondScore = score;
                secondStudent = name;

            }
        }
        System.out.println("The highest scoring student : " + highestStudent);
        System.out.println("The second highest scoring student : " + secondStudent);
    }
}
