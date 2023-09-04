package week_04.assignment;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15) : ");
        int number = input.nextInt();

        if(number < 0 || number > 15){
            System.out.println("Invalid input!");
            System.exit(1);
        }
        else if(number < 10 && number >= 0)
            System.out.println("The hex value is " + number);
        else{
            switch(number){
                case 10 : System.out.println("The hex value is A ");break;
                case 11 : System.out.println("The hex value is B ");break;
                case 12 : System.out.println("The hex value is C ");break;
                case 13 : System.out.println("The hex value is D ");break;
                case 14 : System.out.println("The hex value is E ");break;
                case 15 : System.out.println("The hex value is F ");break;
            }
        }

    }
}
