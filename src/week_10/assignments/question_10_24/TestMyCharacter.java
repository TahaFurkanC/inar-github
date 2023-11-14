package week_10.assignments.question_10_24;

public class TestMyCharacter {
    public static void main(String[] args) {
        MyCharacter c = new MyCharacter('a');

        System.out.println(c.charValue());

        System.out.println(MyCharacter.valueOf('b').charValue());

        MyCharacter c1 = new MyCharacter('z');
        System.out.println(MyCharacter.compare(c.charValue(),c1.charValue()));

        System.out.println(c.compareTo(c1));
    }
}
