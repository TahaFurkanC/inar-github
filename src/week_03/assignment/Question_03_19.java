package week_03.assignment;

import java.util.Scanner;
public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges of the triangle : ");
        int e1 = input.nextInt();
        int e2 = input.nextInt();
        int e3 = input.nextInt();

        if (e1 < 0 || e2 < 0 || e3 < 0 || (e1 + e2) <= e3 || (e1 + e3) <= e2 || (e2 + e3) <= e1) {
            System.out.println("The input is invalid");
            System.exit(1);
        } else
            System.out.println("The perimeter is " + (e1 + e2 + e3));
    }
}