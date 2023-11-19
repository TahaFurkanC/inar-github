package week_11.question_11_10;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack mystack = new MyStack();

        System.out.print("Enter five strings :");
        for (int i = 0; i < 5; i++) {
            mystack.push(input.nextInt());
        }
        System.out.println(mystack.toString());

        System.out.println("Displaying them in reverse order ..");
        for (int i = 0; i < 5; i++) {
            System.out.print(mystack.pop() + " ");
        }
    }
}
