package week_05.assignment;

public class Question_05_40 {
    public static void main(String[] args) {
        int countHeads = 0;
        int countTails = 0;
        int flip ;
        for(int i = 0; i < 1000000; i++){
            flip = (int)(Math.random() * 2);

            if(flip == 0)
                countHeads ++;
            else
                countTails ++;
        }
        System.out.println("Flipping a coin one million times..");
        System.out.println("Heads : " + countHeads);
        System.out.println("Tails : " + countTails);

    }
}
