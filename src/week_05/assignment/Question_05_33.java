package week_05.assignment;

public class Question_05_33 {
    public static void main(String[] args){
        int check = 0;
        System.out.println("Perfect numbers are :");
        for(int i = 1; i < 10000; i++){
            check = 0;
            for(int j = 1; j <= i / 2; j++){
                if(i % j == 0)
                    check += j;
            }
            if(check == i)
                System.out.println(i);
        }
    }
}
