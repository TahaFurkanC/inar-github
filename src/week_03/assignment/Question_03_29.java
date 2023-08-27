package week_03.assignment;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1´s center´s x-, y- coordinates and radius : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.println("Enter circle2´s center´s x-, y- coordinates and radius : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        if((Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))) < Math.abs(radius2 - radius1))
            System.out.println("Nested Circles");
        else if(radius1 + radius2 > Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)))
            System.out.println("Circles overlap");
        else
            System.out.println("Circles do not overlap");

    }
}
