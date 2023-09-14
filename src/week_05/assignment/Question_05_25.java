package week_05.assignment;

public class Question_05_25 {
    public static void main(String[] args){

        double a = 0;
        double b = 0;
        double sum = 0;

        for(int k = 1; k < 11; k++){
            for (double i = 1; i <= 10000 * k; i++) {
                a = Math.pow((-1), i + 1);
                b = 2 * i - 1;
                sum += a / b;
            }
            System.out.println("For i = " + k * 10000 + " approximate pi is " + 4 * sum);
            sum = 0;
        }
    }
}
