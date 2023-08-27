package week_03.assignment;


public class Question_03_16 {
    public static void main(String[] args){

        System.out.println("Random coordinate in rectangle centered at (0,0) with width 100 and height 200 : ");

        int x = (int)(Math.random()*101)- 50;
        int y = (int)(Math.random()*201)- 100;

        System.out.println("The point's x is " + x + " and y is " + y);


    }
}
