package week_11.question_11_02;

import org.w3c.dom.ls.LSOutput;
import week_10.assignments.question_10_14.MyDate;

public class Test_11_02 {
    public static void main(String[] args) {
        System.out.println("     _Person_     ");
        Person person = new Person("Gürol","Istanbul","9999",
                "gurol@inar.com");
        System.out.println(person);

        System.out.println("     _Student_      ");
        Student student = new Student("Nafiz","Istanbul","9999"
                ,"Nafiz@inar.com",0);
        System.out.println(student);

        System.out.println("      _Employee_  ");
        Employee employee = new Employee("Recai","Istanbul,","9999"
                ,"REcai@inar.com",910,6000.0,new MyDate());
        System.out.println(employee);
        System.out.println("        -Faculty_");
        Faculty faculty = new Faculty("Serhat","Ankara","3333","srhat@inar.com",
                205,653.214,new MyDate(),"12","manager");
        System.out.println(faculty);
        System.out.println("         _Staff_");
        Staff staff = new Staff("Elon","California","444","Elon@musk.com",
                23,6521425632.21548,new MyDate(),"CEO");
        System.out.println(staff);
    }
}
