package week_07.assignment;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int ball = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        int[] slots = new int[numberOfSlots - 1];
        String[] dropPath = new String[numberOfSlots - 1];

        int k = 0;
        int random;

        while (k < ball) {
            int numberOfR = 0;
            for (int i = 0; i < numberOfSlots - 1; i++) {
                random = (int) (Math.random() * 2);
                if (random == 1) {
                    dropPath[i] = "R";
                    numberOfR++;
                } else {
                    dropPath[i] = "L";
                }
            }
            slots[numberOfR]++;

            printDropPath(dropPath);

            k++;
        }
        printSlots(slots);

        printDrops(slots);
    }

    public static void printSlots(int[] slots) {
        System.out.println();
        for (int i = 0; i < slots.length; i++) {
            System.out.print(slots[i]);
        }
        System.out.println();

    }

    public static void printDropPath(String[] dropPath) {
        for (int i = 0; i < dropPath.length; i++) {

            System.out.print(dropPath[i]);
        }
        System.out.println();

    }

    public static void printDrops(int[] slots) {
        int max = max(slots);

        for (int i = max; i > 0; i--) {
            System.out.println();

            for (int j = 0; j < slots.length; j++) {
                if (slots[j] >= i) {
                    System.out.print("O");
                } else
                    System.out.print(" ");
            }
        }
    }

    public static int max(int[] list) {
        int max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}
