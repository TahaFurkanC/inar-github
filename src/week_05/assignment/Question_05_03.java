package week_05.assignment;

public class Question_05_03 {
    public static void main(String[] args){
        System.out.print("Kilograms            Pounds");
        for(int i = 1; i < 200; i += 2){
            System.out.printf("\n %-11d %13.1f" , i , (i * 2.2) );
        }
    }
}
