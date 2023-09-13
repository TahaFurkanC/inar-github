package week_05.assignment;

public class Question_05_13 {
    public static void main(String[] args){
        int i = 1;

        while((Math.pow(i,3)) < 12000)
            i++;
        System.out.println("The largest n is " + (i - 1));
    }
}
