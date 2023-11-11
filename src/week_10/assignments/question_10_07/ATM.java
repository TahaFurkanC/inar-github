package week_10.assignments.question_10_07;

import week_09.assignment.Question_09_07.Account;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Create ten accounts with id 0, 1, ..., 9, and initial balance $100
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner input = new Scanner(System.in);

        while (true) {
            // Prompt the user to enter an id
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            // Validate the id
            if (id >= 0 && id < 10) {
                // Display the main menu
                int choice;
                do {
                    System.out.println("\nMain menu");
                    System.out.println("1: Check balance");
                    System.out.println("2: Withdraw");
                    System.out.println("3: Deposit");
                    System.out.println("4: Exit");
                    System.out.print("Enter a choice: ");
                    choice = input.nextInt();

                    // Perform the selected operation
                    switch (choice) {
                        case 1:
                            System.out.println("Balance: $" + accounts[id].getBalance());
                            break;
                        case 2:
                            System.out.print("Enter the amount to withdraw: $");
                            double withdrawAmount = input.nextDouble();
                            accounts[id].withdraw(withdrawAmount);
                            break;
                        case 3:
                            System.out.print("Enter the amount to deposit: $");
                            double depositAmount = input.nextDouble();
                            accounts[id].deposit(depositAmount);
                            break;
                        case 4:
                            // Exit the loop to prompt for a new id
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }
                } while (choice != 4);
            } else {
                System.out.println("Invalid id. Please enter a correct id.");
            }
        }
    }
}
