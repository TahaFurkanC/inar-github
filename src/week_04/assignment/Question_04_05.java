package week_04.assignment;

import java.util.Scanner;
public class Question_04_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides : ");
        int numberOfSides = input.nextInt();

        System.out.println("Enter the side : ");
        double side = input.nextDouble();

        double area = (numberOfSides * Math.pow(side,2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.printf("The area of the polygon is %4.2f " , area);
    }
}
