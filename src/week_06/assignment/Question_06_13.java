package week_06.assignment;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i           m(i)");
        System.out.println("-----------------");
        printSerie(20);
    }
    public static void printSerie(double i){
        double sum = 0;
        for(double j = 1; j <= i; j++){
            sum += j / (j + 1);
            int k = (int)j;
            System.out.printf("%-7d %10.4f\n", k , sum );
        }
    }
}
