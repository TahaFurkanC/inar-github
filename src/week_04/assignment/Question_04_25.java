package week_04.assignment;

public class Question_04_25 {
    public static void main(String[] args){
        char ch1 = (char)(Math.random() * ('Z' - 'A') + 'A');
        char ch2 = (char)(Math.random() * ('Z' - 'A') + 'A');
        char ch3 = (char)(Math.random() * ('Z' - 'A') + 'A');
        int number = (int)(Math.random() * (10000 - 999) + 999);

        System.out.println("Generated plate number : " + ch1 + "" + ch2 + ch3 + number);
    }
}
