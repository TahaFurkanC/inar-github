package week_06.assignment;

public class Question_06_10 {
    public static void main(String[] args) {
        System.out.println("The number of prime less than 10,000 is: " + howManyPrime(10000));
    }
    public static int howManyPrime(int number){
        int counter = 0;
        for(int i = 2; i <= number; i++){
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                counter++;
        }
        return counter;
    }
}
