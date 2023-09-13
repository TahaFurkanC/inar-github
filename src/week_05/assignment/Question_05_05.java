package week_05.assignment;

public class Question_05_05 {
    public static void main(String[] args){
        System.out.print("Kilograms      Pounds        |        Pounds      Kilograms");

        for(int i = 1 , j = 20; i < 200; i += 2 , j += 5){
            System.out.printf("\n%-15d %5.1f        |        %-10d %10.2f" , i ,i * 2.2, j , j * 0.4535  );

        }
    }
}
