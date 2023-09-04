package week_04.assignment;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final double RADIUS = 6371.01 ;

        System.out.println("Enter point 1 (latitude and longitude) in degrees : ");
        double latitude1 = Math.toRadians(input.nextDouble());
        double longitude1 = Math.toRadians(input.nextDouble());

        System.out.println("Enter point 2 (latitude and longitude) in degrees : ");
        double latitude2 = Math.toRadians(input.nextDouble());
        double longitude2 = Math.toRadians(input.nextDouble());

        double greatDistance = RADIUS * Math.acos((Math.sin(latitude1)) * Math.sin(latitude2) + Math.cos(latitude1) *
                Math.cos(latitude2) * Math.cos(longitude1 - longitude2)) ;

        System.out.println("The distance between the two points is " + greatDistance);

    }
}
