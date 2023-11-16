package week_11.question_11_02;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String eMailAddress;

    public Person(){

    }
    public Person(String name, String address, String phoneNumber, String eMailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMailAddress = eMailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }
    public String toString(){
        return
                "Name : " + this.name +
                "\nAddress : " + this.address +
                "\nPhone Number : " + this.phoneNumber +
                "\nE mail address : " + this.eMailAddress;
    }
}
