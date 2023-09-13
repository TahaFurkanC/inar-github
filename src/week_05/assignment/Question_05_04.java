package week_05.assignment;


public class Question_05_04 {
    public static void main(String[] args){
        System.out.println("Miles          Kilometers");

        for(int i = 1; i <= 10; i++){
            System.out.printf("%-14d %-11.3f \n" , i , i * 1.609);
        }

    }
}
