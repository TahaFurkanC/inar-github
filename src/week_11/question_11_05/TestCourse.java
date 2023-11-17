package week_11.question_11_05;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Deutsch");

        course.addStudent("Nisanur Altuntas");
        course.addStudent("Gürkan SERTESER");
        course.addStudent("Sinan Cetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Denis");
        course.addStudent("Berkan Eris");
        System.out.println("After adding student to the course ");

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(course.getStudents().get(i) + " - ");
        }

        System.out.println("\nNumber of student " + course.getNumberOfStudents());

        course.dropStudent("Nisanur Altuntas");
        course.dropStudent("Gürkan SERTESER");
        course.dropStudent("Sinan Cetin");
        System.out.println("----------------------------");
        System.out.println("After dropping student from the course ");

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(course.getStudents().get(i) + " - ");
        }

        System.out.println("\nNumber of student " + course.getNumberOfStudents());
    }
}
