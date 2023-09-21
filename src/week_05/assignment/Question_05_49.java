package week_05.assignment;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String user = input.nextLine().toLowerCase();
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        char ch = ' ';

        for(int i = 0; i < user.length(); i++){
            ch = user.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                numberOfVowels ++;
            }
            else if(ch == ' '){

            }
            else
                numberOfConsonants ++;
        }
        System.out.println("The number of vowels is : " + numberOfVowels + "\n" +
                "The number of consonants is : " + numberOfConsonants);
    }
}
