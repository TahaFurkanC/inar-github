package week_07.assignment;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        int[] tenInteger = new int[10];
        for (int i = 0; i < tenInteger.length; i++) {
            tenInteger[i] = counts(i, numbers);
        }
        System.out.println("Count for each number between 0 and 9:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "s :" + tenInteger[i]);
        }
    }

    public static int counts(int i, int[] numbers) {
        int counts = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == i)
                counts++;
        }
        return counts;
    }
}

