package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_35 {
    public static void main(String[] args) {

        String[] words = {"write","study","program","test","work","tahafurkan","cetinkaya"};
        int number = (int)(Math.random() * words.length);
        int counter = 0;
        char[] word = new char[words[number].length()];
        Arrays.fill(word,'*');
        System.out.println("(Guess) Enter a letter in word " + Arrays.toString(word));

        while(true){
            boolean check = true;
            System.out.println("(Guess) Enter a letter in word " +
                    Arrays.toString(fillLetter(words[number],word)));
            for(int i = 0; i < word.length; i++){
                if(word[i] == '*'){
                    check = false;
                }
            }
            if(check)
                break;
        }
        System.out.println("The word is " + words[number]);
    }
    public static char[] fillLetter(String word,char[] letterList){
        Scanner input = new Scanner(System.in);
        char guess = input.next().charAt(0);
        char[] wordInList = new char[word.length()];
        for(int i = 0; i < wordInList.length; i++){
            wordInList[i] = word.charAt(i);
        }
        for(int i = 0; i < wordInList.length; i++){
            if(guess == wordInList[i]){
                letterList[i] = guess;
            }
        }
        return letterList;
    }
}
