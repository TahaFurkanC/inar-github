package week_12.live_package;

public class TryPrintStackTrace {
    public static void main(String[] args) {
        try {
            // Bir hata oluşturalım (bu örnekte bir dizinin sınırlarını aşmaya çalışalım)
            int[] numbers = new int[3];
            System.out.println(numbers[5]); // Hata burada oluşacak
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hatanın izleme bilgisini konsola yazdır
            e.getStackTrace();
        }
    }

}
