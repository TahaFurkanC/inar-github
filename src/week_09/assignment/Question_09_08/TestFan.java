package week_09.assignment.Question_09_08;

public class TestFan {
    public static void main(String[] args) {
        Fan object1 = new Fan();
        object1.setSpeed(3);
        object1.setRadius(10);
        object1.setColor("yellow");
        object1.setOn(true);

        Fan object2 = new Fan();
        object2.setSpeed(2);
        object2.setRadius(5);
        object2.setColor("blue");
        object2.setOn(false);

        System.out.println("Fan 1 : " + object1.toString());
        System.out.println("-------------------------------");
        System.out.println("Fan 2 : " + object2.toString());
    }
}
