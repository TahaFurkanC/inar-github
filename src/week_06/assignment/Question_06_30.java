package week_06.assignment;

public class Question_06_30 {
    public static void main(String[] args) {

        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        int sum = dice1 + dice2;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        crapsGame(sum);
    }
    public static void crapsGame(int sum){
        int newSum = 0;
        if(sum == 2 || sum == 3 || sum == 12){
            System.out.println("You lose");
        }
        else if(sum == 7 || sum == 11){
            System.out.println("You win");
        }
        else{
            do {

                int newDice1 = (int) (Math.random() * 6 + 1);
                int newDice2 = (int) (Math.random() * 6 + 1);
                newSum = newDice1 + newDice2;
                System.out.println("You rolled " + newDice1 + " + " + newDice2 + " = " + newSum);
                System.out.println("point is " + newSum);
                if (newSum == 7) {
                    System.out.println("You lose");
                    break;
                } else if (newSum == sum) {
                    System.out.println("You win");
                    break;
                }
            }while(true);
        }
    }
}
