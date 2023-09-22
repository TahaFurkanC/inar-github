package week_06.live_class;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are : ");
        printPrimeNumbers(50);
    }
    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIME_PER_LINE       = 10;
        int count = 0;
        int number = 2;

        while(count < numberOfPrimes){
            if(isPrime(number)){
                count++;
                if(count % NUMBER_OF_PRIME_PER_LINE == 0){
                    System.out.printf("%-5d\n", number);
                }
                else
                    System.out.printf("%-5d" ,number);
            }
            number ++;
        }
    }
    public static boolean isPrime(int number){
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
