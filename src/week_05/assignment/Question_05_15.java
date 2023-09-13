package week_05.assignment;

public class Question_05_15 {
    public static void main(String[] args){
        int counter = 0;
        int i = (char) '!' -1;
        while(i < (char)'~'){
            i++;
            counter ++;
            if(counter % 10 == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i + " ");
        }
    }
}
