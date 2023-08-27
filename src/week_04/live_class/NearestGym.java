package week_04.live_class;

import java.util.Scanner;

public class NearestGym {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter where are the locations of Super Gym, Ultra Gym and Incredible Gym on number line?");
        double superGym = input.nextDouble();
        double ultraGym = input.nextDouble();
        double incredibleGym = input.nextDouble();

        double tempMin = Math.min(Math.abs(superGym), Math.abs(ultraGym));
        double min = Math.min(Math.abs(tempMin), Math.abs(incredibleGym));

        System.out.println("Nearest gym is " + min);
    }
}
