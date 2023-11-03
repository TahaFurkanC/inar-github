package week_09.assignment.Question_09_09;

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon object1 = new RegularPolygon();
        RegularPolygon object2 = new RegularPolygon(6,4);
        RegularPolygon object3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("First regular polygon perimeter is : " + object1.getPerimeter() +
                "\tarea is : " + object1.getArea());
        System.out.println("Second regular polygon perimeter is : " + object2.getPerimeter() +
                "\tarea is : " + object2.getArea());
        System.out.println("Third regular polygon perimeter is : " + object3.getPerimeter() +
                "\tarea is : " + object3.getArea());

    }
}
