package week_07.assignment;

public class Question_07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int number = 2;
        int count = 1;
        while(count <= NUMBER_OF_PRIMES){
            if(isPrime(number)){
                if(count % 10 == 0)
                    System.out.printf("%-5d\n", number);
                else
                    System.out.printf("%-5d", number);
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                isPrime = false;
        }
        return isPrime;
    }
}
