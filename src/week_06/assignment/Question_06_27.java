package week_06.assignment;

public class Question_06_27 {
    public static void main(String[] args) {
        int number = 0;
        int counter = 0;
        final int NUMBERS_PER_LINE = 10;
        while(counter < 100){
            String numstr = String.valueOf(number);
            if(!(numstr.equals(reverseNumber(numstr))) && isPrime(number) &&
                    isPrime(Integer.parseInt(reverseNumber(numstr)))){
                counter++;
                if(counter % NUMBERS_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
    public static String reverseNumber(String num){
        String reverseStr = "";
        for(int i = num.length() - 1; i >= 0; i--){
            reverseStr += num.charAt(i);
        }
        return reverseStr;
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }
}
