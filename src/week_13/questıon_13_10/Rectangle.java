package week_13.questıon_13_10;

import week_13.question_13_06.GeometricObject;
import week_13.questıon_13_09.Circle;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public int compareTo(Rectangle o) {
        if(this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        }
        else
            return -1;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rectangle){
            return this.compareTo((Rectangle) obj) == 0;
        }
        return false;
    }
}
