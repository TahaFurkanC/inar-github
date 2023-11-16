package week_11.question_11_03;

import week_09.assignment.Question_09_07.Account;

public class CheckingAccount extends Account {

    private final double OVERDRAFT_LIMIT = -500;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public double getOVERDRAFT_LIMIT() {
        return OVERDRAFT_LIMIT;
    }

    public String toString() {
        return "ID : " + this.getId() +
                "\nBalance : " + this.getBalance() +
                "\nLimit : " + this.getOVERDRAFT_LIMIT() +
                "\n------------------------------";
    }
}
