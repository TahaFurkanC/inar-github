package week_06.assignment;

public class Question_06_38 {
    public static void main(String[] args) {
        int letterCounter = 0;
        int digitCounter = 0;
        for(int i = 1; i <= 100; i++){
            letterCounter++;
            if(letterCounter % 10 == 0)
                System.out.println(getRandomUpperCaseLetter());
            else
                System.out.print(getRandomUpperCaseLetter() + " ");
        }
        for(int i =1; i <= 100; i++){
            digitCounter++;
            if(digitCounter % 10 == 0)
                System.out.println(getRandomDigitCharacter());
            else
                System.out.print(getRandomDigitCharacter() + " ");
        }
    }
    public static char getRandomUpperCaseLetter(){
        int randomInt = (int)(Math.random() * ('Z' - 'A') + 1);
        return (char) (randomInt + 'A');
    }
    public static char getRandomDigitCharacter(){
        int randomDigit = (int)(Math.random() * ('9' - '0') +1);
        return (char) (randomDigit + '0');
    }
}
