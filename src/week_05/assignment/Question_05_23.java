package week_05.assignment;

public class Question_05_23 {
    public static void main(String[] args){

        double fromLeft = 0;
        double fromRight = 0;
        for(int n = 1; n <= 50000; n++){
            fromLeft += 1.0 / n ;
        }
        System.out.println("Summation of series left to right : " + fromLeft);
        for(int n = 50000; n >= 1; n--){
            fromRight += 1.0 / n ;
        }
        System.out.println("Summation of series right to left : " + fromRight);
    }
}
