package week_07.assignment;

public class Question_07_23 {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 100;
        boolean[] locker = new boolean[NUMBER_OF_STUDENTS];

        for (int i = 1; i <= locker.length; i++) {
            for (int j = i - 1; j < locker.length; j += (i)) {
                locker[j] = !locker[j];
            }
        }
        System.out.println("The open lockers are:");
        for (int i = 0; i < locker.length; i++) {
            if (locker[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
