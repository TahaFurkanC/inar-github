package week_10.assignments.question_10_24;

public class MyCharacter {
    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public static MyCharacter valueOf(char ch) {
        return new MyCharacter(ch);
    }

    public char charValue() {
        return ch;
    }

    public static int compare(char a, char b) {
        return a - b;
    }

    public int compareTo(MyCharacter character) {
        return charValue() - character.charValue();
    }

    public boolean equals(MyCharacter character) {
        return (compareTo(character) == 0);
    }

    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }
}
