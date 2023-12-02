package week_13.question_13_05;

public class Test {
    public static void main(String[] args) {

        System.out.println("The larger of the two circles is : ");
        System.out.println(Circle.max(new Circle("White", true,5), new Circle("Red",true,4)));
        System.out.println("\nThe larger of the two rectangle is : ");
        System.out.println(Rectangle.max(new Rectangle("Green",true,15,12), new Rectangle("Pink",true,6, 4)));

//        GeometricObject o1 = new Circle(5);
//        GeometricObject o2 = new Circle(7);
//
//        System.out.println(o1.);

    }
}
