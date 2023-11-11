package week_10.assignments.question_10_09;

public class TestRevisedCourse {
    public static void main(String[] args) {
        RevisedCourse course = new RevisedCourse("inar");
        course.addStudent("emir");
        course.addStudent("özgur");
        course.addStudent("Jack");

        String students[] = course.getStudents();

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }

    }
}
