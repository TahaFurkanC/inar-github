package week_05.live_class;


public class FiftyPrimeNumbers {
    public static void main(String[] args){

        final int NUMBER_OF_PRIME = 50 ;
        final int NUMBER_PER_LINE = 10 ;
        int number = 2 ;
        int count = 0 ;

        while(count < NUMBER_OF_PRIME){
            boolean isPrime = true ;

            for(int divisor = 2; divisor <= number / 2 ; divisor++)
                if(number % divisor == 0){
                    isPrime = false ;
                    break;
                }
            if(isPrime){
                count ++ ;

                if(count % NUMBER_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number ++ ;
        }
        
    }
}
