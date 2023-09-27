package week_06.assignment;

public class Question_06_12 {
    public static void main(String[] args) {
        System.out.println("Characters per 1 to Z");
        printChars('1', 'Z', 10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int counter = 0;
        for(char i = ch1; i <= ch2; i++){
            counter ++;
            if(counter % 10 == 0)
                System.out.println(i);
            else
                System.out.print(i + " ");

        }
    }
}
