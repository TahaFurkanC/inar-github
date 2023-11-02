package week_09.assignment.Question_09_02;

public class StockTest {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.setCurrentPrice(34.35);
        oracle.setPreviousClosingPrice(34.5);
        System.out.println("Stock name : " + oracle.name);
        System.out.println("Stock symbol : " + oracle.symbol);
        System.out.println("Price-change percentage : " + oracle.getChangePercent());
    }
}
