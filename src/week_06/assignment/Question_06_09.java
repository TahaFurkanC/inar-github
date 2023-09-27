package week_06.assignment;

public class Question_06_09 {
    public static void main(String[] args) {

        System.out.println("Feet      Meters        |         Meters        Feet");
        System.out.println("-----------------------------------------------------");

        for(double i = 1, j = 20; i <= 10; i++,j += 5){
            System.out.printf("%-7.1f %7.3f          |         %5.1f %12.3f" , i , feetToMeter(i),
                    j, meterToFeet(j));
            System.out.println();
        }
    }
    public static double feetToMeter(double i){
        return 0.305 * i;
    }
    public static double meterToFeet(double j){
        return 3.279 * j;
    }
}
