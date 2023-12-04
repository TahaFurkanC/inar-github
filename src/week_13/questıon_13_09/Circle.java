package week_13.questıon_13_09;

import week_13.question_13_06.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0 ? newRadius : 0);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o) {
        if(this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        }
        else
            return -1;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Circle){
            return this.compareTo((Circle)obj) == 0;
        }
        return false;
    }
}
