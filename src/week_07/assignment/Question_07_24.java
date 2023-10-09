package week_07.assignment;

public class Question_07_24 {
    public static void main(String[] args) {
        int[] pick = new int[4];
        int countPick = 0;

        for (int i = 0; i < pick.length; i++) {
            while (true) {
                pick[i] = (int) (Math.random() * 52);
                countPick++;

                if (isValid(pick, i)) {
                    break;
                }
            }
        }
        displayDeck(pick, countPick);
    }

    public static boolean isValid(int[] pick, int i) {
        for (int j = 0; j < i; j++) {
            if ((pick[i] / 13) == (pick[j] / 13)) {
                return false;
            }
        }
        return true;
    }

    public static void displayDeck(int[] pick, int count) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",};

        for (int i = 0; i < pick.length; i++) {
            System.out.println(ranks[pick[i] % 13] + " of " + suits[pick[i] / 13]);
        }
        System.out.println("Number of picks: " + count);
    }
}
