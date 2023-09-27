package week_06.assignment;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount          Commission");
        System.out.println("----------------------------------");

        for(int i = 10000; i <= 100000; i += 5000){
            System.out.printf("%-7d %20.1f", i , computeCommission(i));
            System.out.println();
        }
    }
    public static double computeCommission(double salesAmount){
        if(salesAmount > 10000){
            return (5000 * (8.0/100)) + (5000 * (10.0/100) + ((salesAmount - 10000) * 12.0/100));
        }
        else if(salesAmount > 5000){
            return (5000 * (8.0/100)) + ((salesAmount - 5000) * 10.0/100);
        }
        else
            return salesAmount * (8.0/100);
    }
}
