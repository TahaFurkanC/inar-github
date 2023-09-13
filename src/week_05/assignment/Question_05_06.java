package week_05.assignment;

public class Question_05_06 {
    public static void main(String[] args){

        System.out.print("Miles     Kilometers    |    Kilometers     Miles");

        for(int i =1, j = 20; i <= 10 ; i ++ , j += 5){
            System.out.printf("\n%-9d %-7.3f %7c %2c %-14d %-6.3f" , i , i * 1.609 , '|', ' ' , j , j / 1.609 );
        }
    }
}
