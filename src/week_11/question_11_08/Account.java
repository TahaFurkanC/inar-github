package week_11.question_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private String name;

    private int id;
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private Date date = new Date();
    private double annualInterestRate;

    public Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Account(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        if (balance - amount < 0){
            System.out.println("You cannot withdraw $" + amount);
        }
        this.balance -= amount;
        transactions.add(new Transaction('W',amount,
                getBalance(),"Withdraw"));
    }
    public void deposit(double amount){

        this.balance += amount;
        transactions.add(new Transaction('D',amount,
                getBalance(),"Deposit"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getDate() {
        return date;
    }
    public String toString(){
        return  "\nName :" + this.name +
                "\nID :" + this.id +
                "\nBalance :" + this.balance;
    }

}
