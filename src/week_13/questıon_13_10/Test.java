package week_13.questıon_13_10;

public class Test {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3,5);
        Rectangle rec2 = new Rectangle(3,5);
        Rectangle rec3 = new Rectangle(6,4);

        System.out.println("Rectangle1 Area :" + rec1.getArea());
        System.out.println("Rectangle2 Area :" + rec2.getArea());
        System.out.println("Rectangle3 Area :" + rec3.getArea());

        if(rec1.getArea() == rec2.getArea()){
            System.out.println("Rectangle1 is equal to Rectangle2");
        }
        if(rec1.getArea() != rec3.getArea()){
            System.out.println("Rectangle1 is not equal to Rectangle3");
        }
    }
}
