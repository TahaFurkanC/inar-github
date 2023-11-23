package week_12.live_package;

import java.io.IOException;

public class try12_485 {
    public static void main(String[] args) {
        try {
            dosyaOkumaIslemi(true); // true parametresiyle çağrılıyor
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Dosya okuma işlemi sırasında bir IOException oluştu: " + e.getMessage());
        }
    }

    // IOException fırlatan bir metod
    public static void dosyaOkumaIslemi(boolean throwException) throws IOException {
        if (throwException) {
            throw new IOException("Bu bir IOException örneğidir.");
        } else {
            // IOException fırlatılmayacak, başka bir işlem yapılabilir
            System.out.println("Dosya okuma işlemi başarıyla tamamlandı.");
        }
    }
}
