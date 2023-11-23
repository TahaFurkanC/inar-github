package week_12.live_package;

public class checkpoint06_02 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {
        }
        System.out.println("hi");
    }
}
