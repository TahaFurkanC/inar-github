package week_06.assignment;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.println("p                 2^p-1");
        System.out.println("------------------------");

        int p = 2;
        while(p <= 31){
            if(isMersenne(p))
                System.out.printf("%-18d %-8d\n",p,(int)(Math.pow(2,p) - 1));
            p++;
        }
    }
    public static boolean isMersenne(int p){
        boolean isMersenne = true;
        int pform = (int)(Math.pow(2,p) - 1);
        if(Question_06_27.isPrime(pform))
            isMersenne = true;
        else
            isMersenne = false;
        return isMersenne;
    }
}
