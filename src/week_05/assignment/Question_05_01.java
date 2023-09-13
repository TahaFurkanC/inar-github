package week_05.assignment;

import java.util.Scanner;
public class Question_05_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0 : ");
        int number = input.nextInt();

        int positives = 0;
        int negatives = 0;
        double total = 0 ;
        while(number != 0){
            total += number;
            if(number > 0)
                positives ++;
            else
                negatives++;

            number = input.nextInt();
        }
        System.out.println("The number of positives is " + positives + "\nThe number of negatives is " +
                negatives + "\nThe total is " + total + "\nThe average is " + total / (positives + negatives));
    }
}
