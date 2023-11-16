package week_11.question_11_02;

import week_10.assignments.question_10_14.MyDate;

public class Staff extends Employee{
    private String title;

    public Staff(){

    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(int office, double salary, MyDate hiredDate, String title) {
        super(office, salary, hiredDate);
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String eMailAddress, int office, double salary, MyDate hiredDate, String title) {
        super(name, address, phoneNumber, eMailAddress, office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTitle :" + this.title;
    }
}
