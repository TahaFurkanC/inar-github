package week_09.assignment.Question_09_07;

import java.util.Date;

public class Account {
    //         ---------------------
//            |    Account        |
//            ---------------------
//            | -id: int          |
//            | -balance: double    |
    //        | -annualInterestRate:double |
    //        | -dateCreated: Date |
//            ---------------------
//            | +Account()       |
//            | +Account(id: int, balance: double) |
//            | +getId(): int |
//            | +setId(id: int): void |
    //        | +getBalance(): double |
    //        | +setBalance(balance:double): void|
    //        | +getAnnualInterestRate(): double |
    //        | +setAnnualInterestRate(rate:double): void |
    //        | +getDateCreated(): Date |
    //        | +getMonthlyInterestRate(): double|
    //        | +getMonthlyInterest(): double |
    //        | +withdraw(amount:double):void |
    //        | +deposit(amount:double):void |
//            ---------------------
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account(){

    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
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

    public Date getDateCreated() {
        return dateCreated = new Date();
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
}
