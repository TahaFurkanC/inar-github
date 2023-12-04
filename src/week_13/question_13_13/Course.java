package week_13.question_13_13;

import java.util.ArrayList;

public class Course implements Cloneable{
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numberOfStudents--;
    }


    @Override
    public Course clone() {
        try {
            Course o = (Course) super.clone();
            o.students = (ArrayList<String>) students.clone();
            return o;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
