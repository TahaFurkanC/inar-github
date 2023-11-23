package week_12.question_12_01;

import java.util.Scanner;

public class WithExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Birinci sayıyı girin: ");
            double sayi1 = Double.parseDouble(input.nextLine());

            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = Double.parseDouble(input.nextLine());

            System.out.print("İşlemi girin (+, -, *, /): ");
            String operator = input.nextLine();

            double sonuc = 0;

            switch (operator) {
                case "+":
                    sonuc = sayi1 + sayi2;
                    break;
                case "-":
                    sonuc = sayi1 - sayi2;
                    break;
                case "*":
                    sonuc = sayi1 * sayi2;
                    break;
                case "/":
                    if (sayi2 != 0) {
                        sonuc = sayi1 / sayi2;
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
        } catch (NumberFormatException e) {
            System.out.println("Hata: Geçersiz sayı. Lütfen sayısal değerler girin.");
        }
    }
}
