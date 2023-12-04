package week_13.question_13_11;

import week_13.question_13_06.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{

    private double side;

    public Octagon(double side){
        this.side = side;
    }



    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }else if(this.getArea() == o.getArea()){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {
        return (Octagon)super.clone();
    }
    @Override
    public String toString(){
        return "Area: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
