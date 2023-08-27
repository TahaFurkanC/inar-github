package week_03.assignment;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates : ");
        double x = input.nextInt();
        double y = input.nextInt();

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        if(distance <= 10)
            System.out.println("Point (" + x + "," + y + ") is in the circle");
        else
        System.out.println("Point (" + x + "," + y + ") is not in the circle" );

    }
}
