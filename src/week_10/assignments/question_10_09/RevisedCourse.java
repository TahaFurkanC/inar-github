package week_10.assignments.question_10_09;

import java.util.Arrays;

public class RevisedCourse {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public RevisedCourse(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void addStudent(String student){
        if(numberOfStudents >= students.length) {
            String[] newStudents = new String[students.length * 2];
            System.arraycopy(students , 0 , newStudents , 0 , students.length);
            students = newStudents;
        }
        students[numberOfStudents++] = student;

    }
    public void dropStudent(String student){
        for(int i = 0; i < numberOfStudents; i++){
            if(student.equalsIgnoreCase(students[i])){
                students[i] = "";
                for(int k = i; k < numberOfStudents - 1; k++){
                    students[k] = students[k + 1];
                }
                students[numberOfStudents - 1] = "";
                numberOfStudents--;
            }

        }
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void clear(){
        Arrays.fill(students , "");
        numberOfStudents = 0;
    }
}
