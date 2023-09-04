package week_04.assignment;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = input.nextInt();
        System.out.println("Enter a month´s first three letter with the first letter in uppercase");
        String month = input.next();

        if(Character.isLetter(month.charAt(0)) && Character.isLetter(month.charAt(1)) && Character.isLetter(month.charAt(2)) &&
                Character.isUpperCase(month.charAt(0)) && Character.isLowerCase(month.charAt(1)) && Character.isLowerCase(month.charAt(2))) {

            switch (month) {
                case "Jan":
                case "Mar":
                case "May":
                case "Jul":
                case "Aug":
                case "Oct":
                case "Dec":
                    System.out.println(month + " " + year + " has 31 days");break;
                case "Apr":
                case "Jun":
                case "Sep":
                case "Nov":
                    System.out.println(month + " " + year + " has 30 days");break;
                case "Feb":
                    System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? month +
                            " " + year + " has 29 days" : month + " " + year + " has 28 days");break;
                default:
                    System.out.println("Invalid input!");

            }
        }else
            System.out.println("Invalid input!");
    }
}
