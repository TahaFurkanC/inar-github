package week_06.assignment;

public class Question_06_26 {
    public static void main(String[] args) {
        palindromicPrime();
    }
    public static void palindromicPrime(){
        int counter = 0;
        int number = 2;

        while(counter < 100){
            String reverse = "";
            boolean primeCheck = true;
            String numstr = String.valueOf(number);
            for(int i = numstr.length() - 1; i >=0; i--){
                reverse += numstr.charAt(i);
            }
            for(int i = 2; i <= number / 2; i++){
                if(number % i == 0)
                    primeCheck = false;
            }
            if(numstr.equals(reverse) && primeCheck){
                counter++;
                if(counter % 10 == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
}
