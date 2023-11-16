package week_11.question_11_02;

import week_10.assignments.question_10_14.MyDate;

public class Employee extends Person{
    private int office;

    private double salary;

    private MyDate hiredDate;

    public Employee(){

    }
    public Employee(int office, double salary, MyDate hiredDate) {
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public Employee(String name, String address, String phoneNumber, String eMailAddress, int office, double salary, MyDate hiredDate) {
        super(name, address, phoneNumber, eMailAddress);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(MyDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nOffice : " + this.office +
                "\nSalary : " + this.salary +
                "\nHired Date : " + this.hiredDate;
    }
}
