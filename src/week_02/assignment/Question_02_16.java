package week_02.assignment;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of a side : ");
        double side = input.nextDouble();

        System.out.println("The area of the hexagon is " +
                (3*Math.pow(3,0.5))/2* Math.pow(side,2));
    }
}
