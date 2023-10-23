package week_08.assignment;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities:");
        int number = input.nextInt();
        double[][] coordinates = new double[number][2];
        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < number; i++) {
                coordinates[i][0] = input.nextDouble();
                coordinates[i][1] = input.nextDouble();
        }
        double minTotal =Double.MAX_VALUE;
        double[][] centralCity = new double[1][2];
        for (int i = 0; i < number; i++) {
            double total = 0;
            for (int j = 0; j < number; j++) {
                if(i != j) {
                    total += Math.sqrt((Math.pow(coordinates[i][0] - coordinates[j][0], 2))
                            + (Math.pow(coordinates[i][1] - coordinates[j][1], 2)));
                }
            }
            if(minTotal > total){
                minTotal = total;
                centralCity[0][0] = coordinates[i][0];
                centralCity[0][1] = coordinates[i][1];
            }
        }
        System.out.println("Central City Coordinates: (" + centralCity[0][0] + ", " + centralCity[0][1] + ")");
        System.out.println("Total Distance to all other cities: " + minTotal);
    }
}
