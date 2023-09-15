package week_05.assignment;

public class Question_05_26 {
    public static void main(String[] args) {

        double n = 1.0;
        double e = 1;
        for(int t = 1; t < 11 ; t++){
            for (int i = 1; i <= t * 10000; i++) {
                for (int f = i; f > 0; f--) {
                n *= f;
            }
                e += 1.0 / n;
                n = 1.0;
            }
            System.out.println("e at i = " + (t * 10000) + " is " + e);
            e = 1 ;
        }
        double javasE = Math.E;
        System.out.println("Java's e is " + javasE);
    }
}


