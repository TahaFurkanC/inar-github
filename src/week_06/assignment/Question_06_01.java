package week_06.assignment;

public class Question_06_01 {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers, ten per line:");
        int counter = 0;
        final int NUMBER_PER_LINE = 10;
        for(int i = 1; i <= 100; i++){
            if(i % NUMBER_PER_LINE == 0)
                System.out.printf("%8d\n", getPentagonalNumber(i));
            else
                System.out.printf("%8d", getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n){
        int pentagonalNumbers = (n * (3 * n - 1)) / 2;
        return pentagonalNumbers;
    }
}
