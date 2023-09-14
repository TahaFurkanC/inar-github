package week_05.assignment;

public class Question_05_20 {
    public static void main(String[] args) {
        int counter = 0;
        final int NUMBERS_PER_LINE = 8;

        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;

            for (int d = 2; d <= (i / 2); d++) {
                if (i % d == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                counter++;
                if(counter % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }

        }
    }
}


