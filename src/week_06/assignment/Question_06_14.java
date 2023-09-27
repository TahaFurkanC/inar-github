package week_06.assignment;

import java.util.Scanner;

public class Question_06_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int i = input.nextInt();

        System.out.println("i           m(i)");
        System.out.println("-------------------");

        for(int a = 1; a < 1000; a += 100){
            System.out.printf("%-10d %5.4f\n", a , computePi(a));
        }
    }
    public static double computePi(double i){
        double sum = 0;
        for(double j = 1; j <= i; j ++){
            sum += Math.pow(-1,j + 1) / (2 * j - 1);
        }
        return 4 * sum;
    }
}
