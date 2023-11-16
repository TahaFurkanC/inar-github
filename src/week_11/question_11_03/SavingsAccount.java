package week_11.question_11_03;

import week_09.assignment.Question_09_07.Account;

public class SavingsAccount extends Account {
    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "\nID : " + this.getId() +
                "\nBalance : " + this.getBalance() +
                "\n------------------------------";
    }
}
