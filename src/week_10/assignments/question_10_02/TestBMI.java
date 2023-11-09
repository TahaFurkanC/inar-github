package week_10.assignments.question_10_02;

public class TestBMI {
    public static void main(String[] args) {
        BMI object = new BMI("Taha",27,165,68.5);
        System.out.println(object.getName() + "\n" + object.getBMI() + "\n" + object.getStatus());
    }
}
