package week_09.assignment.Question_09_07;

public class TestAccount {
    public static void main(String[] args) {
        Account object = new Account(1122,20000);
        object.setAnnualInterestRate(4.5);
        object.withdraw(2500);
        object.deposit(3000);

        System.out.println("                Account Statement:");
        System.out.println("------------------------------------------------------");
        System.out.println("Account ID      : " + object.getId());
        System.out.println("Date created    : " + object.getDateCreated());
        System.out.println("Balance         : " + object.getBalance());
        System.out.println("Monthly Interest: " + object.getMonthlyInterest());
    }
}
