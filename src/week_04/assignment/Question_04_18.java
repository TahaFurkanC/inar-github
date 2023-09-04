package week_04.assignment;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters : ");
        String user = input.next().toUpperCase();

        char ch1 = user.charAt(0);
        char ch2 = user.charAt(1);

        switch(ch1){
            case 'M' : System.out.print("Mathematics ");break;
            case 'C' : System.out.print("Computer Science ");break;
            case 'I' : System.out.print("Information Technology ");break;
            default : System.out.println("Invalid input");System.exit(1);
        }
        switch (ch2){
            case '1' : System.out.println("Freshman");break;
            case '2' : System.out.println("Sophomore");break;
            case '3' : System.out.println("Junior");break;
            case '4' : System.out.println("Senior");break;
            default : System.out.println("Invalid input");
        }
    }
}
