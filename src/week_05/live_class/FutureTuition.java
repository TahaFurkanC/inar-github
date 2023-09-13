package week_05.live_class;

public class FutureTuition {
    public static void main(String[] args){
        double tuition = 10000 ;
        int year = 0 ;

        while(tuition < 20000){
            tuition *= 1.07;
            year++;
        }
        System.out.println("After " + year + " years tuition will be " + tuition);
    }
}
