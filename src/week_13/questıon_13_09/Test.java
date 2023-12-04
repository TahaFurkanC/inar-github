package week_13.questıon_13_09;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);
        Circle circle3 = new Circle(5);
        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle2 radius: " + circle2.getRadius());
        System.out.println("Circle3 radius: " + circle3.getRadius());

        if(circle1.equals(circle2)){
            System.out.println("Circle1 is equal to circle2");
        }
        else
            System.out.println("Circle1 is not equal to circle2");

        if(circle1.equals(circle3)){
            System.out.println("Circle1 is equal to circle3");
        }
        else
            System.out.println("Circle1 is not equal to circle3");
    }
}
