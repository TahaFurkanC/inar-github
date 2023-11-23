package week_12.question_12_01;

import java.util.Scanner;

public class WithoutExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        String sayi1 = input.nextLine();
        int sayi10 = checkInput(sayi1);
        if (sayi10 != Integer.MIN_VALUE) {
            System.out.print("İkinci sayıyı girin: ");
            String sayi2 = input.nextLine();
            int sayi20 = checkInput(sayi2);

            if (sayi20 != Integer.MIN_VALUE) {
                checkNumber(sayi10, sayi20, input);
            }
        }

        System.out.println("Code goes on..");
    }

    private static void checkNumber(int sayi10, int sayi20, Scanner input) {
        System.out.print("İşlemi girin (+, -, *, /): ");
        String operator = input.nextLine();

        double sonuc = 0;

        switch (operator) {
            case "+":
                sonuc = sayi10 + sayi20;
                break;
            case "-":
                sonuc = sayi10 - sayi20;
                break;
            case "*":
                sonuc = sayi10 * sayi20;
                break;
            case "/":
                if (sayi20 != 0) {
                    sonuc = sayi10 / sayi20;
                } else {
                    System.out.println("Hata: Sıfıra bölme hatası.");
                    return;
                }
                break;
            default:
                System.out.println("Hata: Geçersiz operatör.");
                return;
        }

        System.out.println("Sonuç: " + sonuc);

    }

    private static int checkInput(String sayi) {
        for (int i = 0; i < sayi.length(); i++) {
            if (!Character.isDigit(sayi.charAt(i))) {
                System.out.println("input must be digit!");
                return Integer.MIN_VALUE;
            }
        }
        return Integer.parseInt(sayi);
    }
}
