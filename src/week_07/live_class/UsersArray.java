package week_07.live_class;

import java.util.Scanner;

public class UsersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100:");

        // Create an array to store the integers.
        int[] numbers = new int[100]; // Assuming a maximum of 100 integers

        int i = 0; // Initialize the counter

        // Read integers from the user until they enter 0 or reach the limit.
        while (true) {
            int num = input.nextInt();

            if (num == 0 || i >= numbers.length) {
                break; // Exit the loop if 0 is entered or the array is full.
            }

            if (num >= 1 && num <= 100) {
                numbers[i++] = num; // Store the valid number in the array and increment the counter.
            } else {
                System.out.println("Please enter a number between 1 and 100.");
            }
        }

        // Print the entered numbers.
        print(numbers, i);
    }

    public static void print(int[] numbers, int count) {
        System.out.print("Entered numbers: ");
        for (int j = 0; j < count; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }
}

