package week_07.assignment;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] students = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + " :");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }

        decreasingSort(scores, students);

        System.out.println("Student names in decreasing order of their scores:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " " + scores[i]);
        }
    }
    public static void decreasingSort(int[] list, String[] students) {
        String temp;
        for (int i = 0; i < list.length - 1; i++) {
            int currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;

                temp = students[i];
                students[i] = students[currentMaxIndex];
                students[currentMaxIndex] = temp;
            }
        }
    }

}
