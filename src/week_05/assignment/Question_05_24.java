package week_05.assignment;

public class Question_05_24 {
    public static void main(String[] args){
        double sum = 0;
        for(double i = 1 , j = 3; i <= 97; i += 2, j += 2){
            sum += i / j ;
        }
        System.out.println("Sum of series : " + sum);
    }
}
