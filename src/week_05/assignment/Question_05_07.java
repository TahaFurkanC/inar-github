package week_05.assignment;

public class Question_05_07 {
    public static void main(String[] args){

        int tuition = 10000;

        for(int i = 1; i <= 10; i++){
            tuition = tuition + ((tuition * 5) / 100) ;
        }
        System.out.println("Tuition in ten years : " + tuition);

        int cost = 0;

        for(int i = 1; i <= 4; i++){
            cost += (tuition + ((tuition * 5) / 100)) ;
            tuition = tuition + ((tuition * 5) / 100) ;
        }
        System.out.println("Total cost for four years' worth of tuition after the tenth year : " + cost);
    }
}
