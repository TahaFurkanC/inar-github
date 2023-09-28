package week_06.assignment;

public class Question_06_29 {
    public static void main(String[] args) {
        for(int i = 2; i < 1000; i++){
            if(isPrime(i) && isPrime(i + 2))
                System.out.println("(" + i + ", " + (i + 2) + ")");
        }
    }
    public static boolean isPrime(int num){
        for(int j = 2; j <= num / 2; j++){
            if(num % j == 0)
                return false;
        }
        return true;
    }
}
