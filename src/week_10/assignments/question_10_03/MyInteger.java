package week_10.assignments.question_10_03;

public class MyInteger {
//            ----------------------------------
//            |           MyInteger            |
//            ----------------------------------
//            | - value: int                   |
//            ----------------------------------
//            | + MyInteger(value: int)        |
//            | + getValue(): int              |
//            | + isEven(): boolean            |
//            | + isOdd(): boolean             |
//            | + isPrime(): boolean           |
//            | + isEven(value: int): boolean  |
//            | + isOdd(value: int): boolean   |
//            | + isPrime(value: int): boolean |
//            | + isEven(obj: MyInteger):      |
//            |        boolean                 |
//            | + isOdd(obj: MyInteger):       |
//            |        boolean                 |
//            | + isPrime(obj: MyInteger):     |
//            |        boolean                 |
//            | + equals(value: int): boolean  |
//            | + equals(obj: MyInteger):      |
//            |        boolean                 |
//            | + parseInt(ch: char[]): int    |
//            | + parseInt(s: String): int     |
//            ----------------------------------
private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(this.value);
    }

    public boolean isOdd() {
        return isOdd(this.value);
    }

    public boolean isPrime() {
        return isPrime(this.value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger obj) {
        return obj.isEven();
    }

    public static boolean isOdd(MyInteger obj) {
        return obj.isOdd();
    }

    public static boolean isPrime(MyInteger obj) {
        return obj.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger obj) {
        return this.value == obj.getValue();
    }

    public static int parseInt(char[] ch) {
        return Integer.parseInt(new String(ch));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
