package week_05.assignment;

public class Question_05_10 {
    public static void main(String[] args){
        int counter = 0 ;

        for(int i = 100; i < 1000; i++){
            if(i % 5 == 0 && i % 6 == 0){
                counter ++ ;
                if(counter % 10 == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }

    }
}
