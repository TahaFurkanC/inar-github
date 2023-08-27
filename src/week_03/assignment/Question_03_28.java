package week_03.assignment;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1´s center x-, y- coordinates, width, and height : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.println("Enter r2´s center x-, y- coordinates, width, and height : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double r1LeftEdge = x1 - width1 / 2 ;
        double r1RightEdge = x1 + width1 / 2 ;
        double r1TopEdge = y1 + height1 / 2 ;
        double r1BottomEdge = y1 - height1 / 2 ;
        double r2LeftEdge = x2 - width2 / 2 ;
        double r2RightEdge = x2 + width2 / 2 ;
        double r2TopEdge = y2 + height2 / 2 ;
        double r2BottomEdge = y2 - height2 / 2 ;

        if(r1LeftEdge >= r2LeftEdge && r1RightEdge <= r2RightEdge && r1BottomEdge >= r2BottomEdge && r1TopEdge <= r2TopEdge)
            System.out.println("r1 is inside r2");
        else if(r1LeftEdge <= r2LeftEdge && r1RightEdge >= r2RightEdge && r1BottomEdge <= r2BottomEdge && r1TopEdge >= r2TopEdge)
            System.out.println("r2 is inside r1");
        else if(r1RightEdge < r2LeftEdge || r1LeftEdge > r2RightEdge || r1BottomEdge > r2TopEdge || r1TopEdge < r2BottomEdge)
            System.out.println("r1 and r2 does not overlap");
        else
            System.out.println("r1 and r2 overlaps");
    }
}
