package week_03.assignment;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point´s x- and y- coordinates : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(x >= 0 && y >= 0 && (x + 2 * y) <= 200 )
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
