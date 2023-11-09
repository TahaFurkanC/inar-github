package week_10.assignments.question_10_03;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(17);
        System.out.println("Value: " + myInt.getValue());
        System.out.println("isEven: " + myInt.isEven());
        System.out.println("isOdd: " + myInt.isOdd());
        System.out.println("isPrime: " + myInt.isPrime());
        System.out.println("Equals 17: " + myInt.equals(17));
        System.out.println("Equals 19: " + myInt.equals(19));

        char[] ch = {'1', '2', '3', '4'};
        System.out.println("Parse Int from char[]: " + MyInteger.parseInt(ch));
        System.out.println("Parse Int from String: " + MyInteger.parseInt("1234"));
    }
}

