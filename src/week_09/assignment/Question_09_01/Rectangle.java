package week_09.assignment.Question_09_01;

public class Rectangle {
//            ---------------------
//            |    Rectangle      |
//            ---------------------
//            | width: double     |
//            | height: double    |
//            ---------------------
//            | Rectangle()       |
//            | Rectangle(w: double, h: double) |
//            | getArea(): double |
//            | getPerimeter(): double |
//            ---------------------

    double width = 1;
    double height = 1;

    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }

}
