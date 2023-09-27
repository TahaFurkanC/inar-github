package week_06.assignment;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius        Fahrenheit      |       Fahrenheit        Celsius");
        System.out.println("-----------------------------------------------------------------");

        for(double i = 40, j = 120; i > 30; i--, j-=10){
            System.out.printf("%-8.1f %12.1f          |          %-8.1f %12.2f\n" ,i,celsiusToFahrenheit(i),
                    j, fahrenheitToCelsius(j));
        }
    }
    public static double celsiusToFahrenheit(double i){
        return (9.0/5) * i + 32;
    }
    public static double fahrenheitToCelsius(double j){
        return (5.0 / 9) * (j - 32);
    }
}
