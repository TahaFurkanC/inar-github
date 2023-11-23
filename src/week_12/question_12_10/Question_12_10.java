package week_12.question_12_10;

public class Question_12_10 {
    public static void main(String[] args) {
        try{
            int[] arr = new int[Integer.MAX_VALUE];
        }
        catch(OutOfMemoryError er){
            System.out.println("OutOfMemoryError occurs!");
        }
    }
}
