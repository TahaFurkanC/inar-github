package week_02.assignment;

import java.util.Scanner;
public class Question_02_05 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate : ");
        double total = input.nextDouble();
        double gratuity = input.nextDouble();

        System.out.println("The gratuity is $" + total*(gratuity/100) + " and total is $" +
                ((total*(gratuity/100)) + total));
    }
}
