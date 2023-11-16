package week_11.question_11_02;

import week_10.assignments.question_10_14.MyDate;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(){

    }
    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(int office, double salary, MyDate hiredDate, String officeHours, String rank) {
        super(office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String eMailAddress, int office, double salary, MyDate hiredDate, String officeHours, String rank) {
        super(name, address, phoneNumber, eMailAddress, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nOffice Hours :" + this.officeHours +
                "\nRank :" + this.rank;
    }
}
