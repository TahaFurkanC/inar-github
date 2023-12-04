package week_13.question_13_13;

public class Test {
    public static void main(String[] args) {
        Course c1 = new Course("Inar Academy");
        c1.addStudent("Fatih");
        c1.addStudent("Özgür");
        c1.addStudent("Gürol");
        c1.addStudent("Mehmet");

        Course c2 = c1.clone();
        c2.addStudent("Taha");
        c2.addStudent("Nafiz");

        System.out.println("Number of students in course1 : " + c1.getNumberOfStudents());
        System.out.println(c1.getStudents());
        System.out.println("--------------");
        System.out.println("Number of students in course2 : " + c2.getNumberOfStudents());
        System.out.println(c2.getStudents());
    }
}
