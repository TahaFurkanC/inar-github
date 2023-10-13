package week_07.assignment;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to sort:");
        String str = input.next().toLowerCase();

        System.out.println("Sorted form:" + sort(str));
    }
    public static String sort(String str){
        char[] chars = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            chars[i] = str.charAt(i);
        }
        for(int i = 0; i < chars.length - 1; i++){
            for(int k = i + 1; k < chars.length; k++){
                if(chars[i] > chars[k]){
                    char temp = chars[i];
                    chars[i] = chars[k];
                    chars[k] = temp;
                }
            }
        }
        return String.valueOf(chars);
    }
}
